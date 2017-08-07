package banger.action.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bs")
public class BsHandler {
	

	@RequestMapping("/login")
	public String login(){
		return "bsorderlist";
	}

}
