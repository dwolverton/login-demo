package co.grandcircus.logindemo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.logindemo.dao.UserRepository;
import co.grandcircus.logindemo.entity.User;

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
	public ModelAndView submitSignup(User user, HttpSession session) {
		// 1. Add to database
		dao.save(user);
		
		// 2. Add to session
		session.setAttribute("user", user);
		
		ModelAndView mv = new ModelAndView("thanks");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login-form");
	}
	
	@PostMapping("/login")
	public ModelAndView submitLogin(
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		HttpSession session
			) {
		
		// check the database for the user that matches both email and password
		User user = dao.findByEmailAndPassword(email, password);
		System.out.println(user);
		
		// if not found, show the form again with error message
		if (user == null) {
			return new ModelAndView("login-form", "message", "Incorrect username or password.");
		}
		
		// "login" just means adding the user to the session
		session.setAttribute("user", user);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		// This clears the session and starts a brand new clean one.
		session.invalidate();
		
		return new ModelAndView("redirect:/");
	}
	
}
