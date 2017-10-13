package edu.vortex.facebookByJS.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value={"/","home"})
    public String home(){
        return "home";
    }

	@RequestMapping(value="/welcome")
	public String welcome(){
	    return "welcome";
	}
	
	@RequestMapping(value="/admin")
	public String admin(@AuthenticationPrincipal User active){
		System.out.println(active.getUsername());
	    return "admin";
	}
	
	@RequestMapping(value="/login")
	public String login(){
	    return "login";
	}
	
	@RequestMapping(value="/403")
	public String Error403(){
	    return "403";
	}
}
