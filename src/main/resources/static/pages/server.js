const express = require("express");
const fs = require("fs");

const app = express();
app.use(express.json());
app.use(express.static(__dirname)); // 允许访问静态文件
app.use(express.urlencoded({ extended: true }));


// 处理前端提交的更新请求
app.post("/updateAtlas", (req, res) => {
  const updatedData = req.body;

  if (Array.isArray(req.body)) {
    req.body = req.body[0]; // 只取第一个元素
  }

  if (typeof req.body !== 'object') {
    return res.status(400).json({ error: 'Invalid JSON format' });
  }


  // 读取当前的 Atlas.json
  fs.readFile("testData/Atlas.json", "utf8", (err, data) => {
    if (err) {
      return res.status(500).json({ message: "Error reading file" });
    }

    let atlasData = JSON.parse(data);

    // 遍历 updatedData，更新 Atlas.json 里的相应 matchNumber 数据
    updatedData.forEach(updatedMatch => {
      updatedMatch.matchNumber = parseInt(updatedMatch.matchNumber);
      let index = atlasData.findIndex(item => item.matchNumber === updatedMatch.matchNumber);
      if (index !== -1) {
        atlasData[index] = updatedMatch; // 替换旧数据
      }
    });

    console.log(atlasData);

    // 把更新后的数据写回 Atlas.json
    fs.writeFile("testData/Atlas.json", JSON.stringify(atlasData, null, 2), err => {
      if (err) {
        return res.status(500).json({ message: "Error writing file" });
      }
      res.json({ message: "Data saved successfully!" });
    });
  });
});

// 启动服务器
const PORT = 3000;
app.listen(PORT, () => console.log(`Server running on http://localhost:${PORT}`));
