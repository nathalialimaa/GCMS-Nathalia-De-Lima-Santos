package com.example.WebApp; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller 
public class HomeController { 
	
	@RequestMapping("/") 
	public @ResponseBody String greeting() { 
	return "Hello, World!"; 
	}
	
	@RequestMapping("/Nathalia") 
	 public @ResponseBody String greetingNathalia() { 
	  return "Hello, Nathalia!"; 
	 } 
	@RequestMapping("/NathaliaDaCopia1") 
	 public @ResponseBody String greetingNathaliaDaCopia1() { 
	  return "Hello, Nathalia da copia 1!"; 
	 }
	
	@RequestMapping("/CopiaNathy") 
	 public @ResponseBody String greetingCopiaNathy() { 
	  return "Hello, Cópia de Nathalia!"; 
	 } 
	
	@RequestMapping("/NathyImitona") 
	 public @ResponseBody String greetingNathyImitona() { 
	  return "Hello, Nathalia Imitona!"; 
	 } 
 
}