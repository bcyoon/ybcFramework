package ybc.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String getHello(Model model) {
		
		model.addAttribute("aaa", "aaa 값");
		model.addAttribute("bbb", "bbbb 값");
		
		return "hello/helloView"; 
		 
	}	
	
	
}
