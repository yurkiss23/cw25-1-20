package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	@RequestMapping("/login")
	public String login() {
		System.out.println("---Login page---");
		return "account/login";
	}
	
	@RequestMapping("/register")
	public String register() {
		System.out.println("---Register page---");
		return "account/register";
	}
}
