package com.nrg948;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class LightHouseServerApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testAtlasPOSTandGET() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Atlas/948_Playoffs_3_1819.json")));
		
		mockMvc.perform(post("/api/atlas")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/atlas"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
	}
	
	@Test
	public void testChronosPOSTandGET() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Chronos/948_Playoffs_3_8953.json")));
		
		mockMvc.perform(post("/api/chronos")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/chronos"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
	}
	
	@Test
	public void testPitPOSTandGET() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Pit/948_Pit_8703.json")));
		
		mockMvc.perform(post("/api/pit")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/pit"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
	}
	
	@Test
	public void testHPPOSTandGET() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Human Player/948_492_HumanPlayer_4169.json")));
		
		mockMvc.perform(post("/api/hp")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/hp"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
	}
	
	@Test
	public void testAtlasPATCH() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Atlas/948_Playoffs_3_1819.json")));
		String jsonPatch = new String(Files.readAllBytes(Paths.get("./test-files/Atlas/948_Playoffs_3_1819_PATCH.json")));
		String jsonVerify = new String(Files.readAllBytes(Paths.get("./test-files/Atlas/948_Playoffs_3_1819_PATCH_VERIFY.json")));
		
		mockMvc.perform(post("/api/atlas")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/atlas"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
		
		mockMvc.perform(post(("/api/patch"))
			.contentType("application/json")
			.content(jsonPatch))
			.andExpect(status().isOk());
		
		mockMvc.perform(get("/api/atlas")
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json(jsonVerify));
	}
	
	@Test
	public void testChronosPATCH() throws Exception {
		String jsonTest = new String(Files.readAllBytes(Paths.get("./test-files/Chronos/948_Playoffs_3_8953.json")));
		String jsonPatch = new String(Files.readAllBytes(Paths.get("./test-files/Chronos/948_Playoffs_3_8953_PATCH.json")));
		String jsonVerify = new String(Files.readAllBytes(Paths.get("./test-files/Chronos/948_Playoffs_3_8953_PATCH_VERIFY.json")));
		
		mockMvc.perform(post("/api/chronos")
			.contentType("application/json")
			.content(jsonTest))
			.andExpect(status().isOk());
		
		mockMvc.perform(get(("/api/chronos"))
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json("[" + jsonTest + "]"));
		
		mockMvc.perform(post(("/api/patch"))
			.contentType("application/json")
			.content(jsonPatch))
			.andExpect(status().isOk());
		
		mockMvc.perform(get("/api/chronos")
			.contentType("application/json"))
			.andExpect(status().isOk())
			.andExpect(content().json(jsonVerify));
	}
}
