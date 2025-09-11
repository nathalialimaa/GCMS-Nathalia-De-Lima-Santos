package com.example.WebApp; 
 
import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
 
import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc; 
 
@SpringBootTest 
@AutoConfigureMockMvc 
class WebAppApplicationTests { 
	 
	 @Autowired 
	 private MockMvc mockMvc; 
	 
	 @Test 
	 public void shouldReturnDefaultMessage() throws Exception { 
	  this.mockMvc.perform(get("/")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Hello, World!"))); 
	  
	  this.mockMvc.perform(get("/Nathalia")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Hello, Nathalia!")));  
	 
	  this.mockMvc.perform(get("/CopiaNathy")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Hello, Cópia de Nathalia!"))); 
	  
	  this.mockMvc.perform(get("/NathaliaImitona")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Hello, Nathalia Imitona!"))); 
	  
	  this.mockMvc.perform(get("/hotfix")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Hello, hotfix!"))); 
	  
	  
	 
	  this.mockMvc.perform(get("/testejenkins")) 
	    .andDo(print()).andExpect(status().isOk()) 
	    .andExpect(content() 
	     .string(containsString("Rodando no Jenkins!"))); 
	  
	  
	 }
	 
	 

 
} 