package co.grandcircus.logindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.logindemo.dao.UserRepository;

@Controller
public class LogInDemoController {
	
	@Autowired
	private UserRepository dao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/signup")
	public ModelAndView showSignup() {
		return new ModelAndView("signup-form");
	}
	
	@RequestMapping("/signup-confirmation")
	public ModelAndView submitSignup() {
		return new ModelAndView("thanks");
	}
}
