package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mvcclass {

	@RequestMapping("/mvc")
	public String mvc() {
		return "mvc";
	}
	
	@RequestMapping("/saveData")
	public String saveData(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("mob") String mob,
			@RequestParam("pass") String pass,Model m) {		
		System.out.println(name+" : "+email+" : "+mob+" : "+pass);
		
		Bean b=new Bean();
		b.setName(name);
		b.setEmail(email);
		b.setPass(pass);
		b.setMob(mob);
		m.addAttribute("bean",b);
		
		return "success";
	}
}
