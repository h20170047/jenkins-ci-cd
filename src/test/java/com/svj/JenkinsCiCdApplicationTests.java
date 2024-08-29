package com.svj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//@SpringBootTest
@WebMvcTest
class JenkinsCiCdApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception {
		String name = "Swaraj K R";

		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello Swaraj K R, Congratulations, you have completed initial Jenkins CI/CD demo !"));
	}

}
