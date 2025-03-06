// const express = require("express");
// const fs = require("fs");

// const app = express();
// app.use(express.json());
// app.use(express.static(__dirname)); // 允许访问静态文件
// app.use(express.urlencoded({ extended: true }));


// // 处理前端提交的更新请求
// app.post("/updateAtlas", (req, res) => {
//   const updatedData = req.body;

//   if (Array.isArray(req.body)) {
//     req.body = req.body[0]; // 只取第一个元素
//   }

//   if (typeof req.body !== 'object') {
//     return res.status(400).json({ error: 'Invalid JSON format' });
//   }


//   // 读取当前的 Atlas.json
//   fs.readFile("testData/Atlas.json", "utf8", (err, data) => {
//     if (err) {
//       return res.status(500).json({ message: "Error reading file" });
//     }

//     let atlasData = JSON.parse(data);

//     // 遍历 updatedData，更新 Atlas.json 里的相应 matchNumber 数据
//     updatedData.forEach(updatedMatch => {
//       updatedMatch.matchNumber = parseInt(updatedMatch.matchNumber);
//       let index = atlasData.findIndex(item => item.matchNumber === updatedMatch.matchNumber);
//       if (index !== -1) {
//         atlasData[index] = updatedMatch; // 替换旧数据
//       }
//     });

//     console.log(atlasData);

//     // 把更新后的数据写回 Atlas.json
//     fs.writeFile("testData/Atlas.json", JSON.stringify(atlasData, null, 2), err => {
//       if (err) {
//         return res.status(500).json({ message: "Error writing file" });
//       }
//       res.json({ message: "Data saved successfully!" });
//     });
//   });
// });

// // 启动服务器
// const PORT = 3000;
// app.listen(PORT, () => console.log(`Server running on http://localhost:${PORT}`));

const path = require("path");
const express = require("express");
const fs = require("fs");
const cors = require("cors"); // Add CORS middleware


const app = express();
app.use(cors()); // Enable CORS for all routes
app.use(express.json());
app.use(express.static(__dirname));
app.use(express.urlencoded({ extended: true }));

// Handle POST requests
app.post("/updateAtlas", (req, res) => {
  console.log("Received data:", JSON.stringify(req.body, null, 2)); // 打印完整请求体
  const updatedData = req.body;

  if (!updatedData) {
    return res.status(400).json({ error: "No data provided" });
  }
  // Validate incoming data
  if (!Array.isArray(updatedData)) {
    return res.status(400).json({ error: "Expected an array of match data" });
  }

  if (Array.isArray(updatedData)) {
    updatedData.forEach(match => {
      match.matchNumber = parseInt(match.matchNumber);
    });
  }

  // Read current Atlas.json
  fs.readFile(path.join(__dirname, "testData/Atlas.json"), "utf8", (err, data) => {
    if (err) {
      console.error("Error reading Atlas.json:", err); // 打印读取错误
      return res.status(500).json({ message: "Error reading file" });
    }

    try {
      let atlasData = JSON.parse(data);
    } catch (parseError) {
      console.error("Error parsing Atlas.json:", parseError); // 打印 JSON 解析错误
      return res.status(500).json({ message: "Invalid JSON format" });
    }

    let atlasData = JSON.parse(data);

    // Update each match entry
    updatedData.forEach(updatedMatch => {
      const matchNumber = parseInt(updatedMatch.matchNumber);
      const index = atlasData.findIndex(item => item.matchNumber === matchNumber);


      if (index !== -1) {
        const originalData = atlasData[index];

        updatedMatch.matchNumber = matchNumber;

        Object.keys(updatedMatch).forEach(key => {
          if (key === "matchNumber") {
            return; // 跳过无需处理的字段
          }
          const value = updatedMatch[key];
          const originalType = typeof originalData[key];
          const originalValue = originalData[key];

          // 类型转换逻辑
          if (Array.isArray(originalValue)) {
            // 处理数组类型（如 autoCoralScored）
            updatedMatch[key] = value.split(",").map(item => item.trim());
          } else if (originalType === "boolean") {
            // 处理布尔类型（如 robotDisabled）
            updatedMatch[key] = value.toLowerCase() === "true";
          } else if (originalType === "number") {
            // 处理数字类型（如 dataQuality）
            updatedMatch[key] = isNaN(value) ? originalValue : parseFloat(value);
          } else if (key === "teamNumber" || key === "climbStartTime") {
            // 处理应为整数的字段
            updatedMatch[key] = parseInt(value) || originalValue;
          } else {
            // 其他字段保留原始类型
            updatedMatch[key] = value;
          }
        });
        console.log(`Updating match ${matchNumber}:`, JSON.stringify(updatedMatch, null, 2));


        atlasData[index] = { ...originalData, ...updatedMatch };
      }
    });

    // Write updated data back to file
    fs.writeFile(path.join(__dirname, "testData/Atlas.json"), JSON.stringify(atlasData, null, 2), err => {
      if (err) {
        return res.status(500).json({ message: "Error writing file" });
      }
      res.json({ message: "Data saved successfully!" });
    });
  });
});

// Start server
const PORT = 3000;
app.listen(PORT, () => console.log(`Server running on http://localhost:${PORT}`));