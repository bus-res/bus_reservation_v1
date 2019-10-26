package com.lti.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.*;
import com.lti.service.ChangePasswordService;
import com.lti.service.RegisterService;
import com.mail.Sendmail;


@Controller
public class RegistrationController {

	
	@Resource
	private ChangePasswordService changePasswordService;
	
	@Autowired
	private RegisterService registerService;
//registration
	@RequestMapping(path="/registration.lti")
public String register(RegisterEntity register) {
	registerService.register(register);
		return "homepage.jsp";
	}
	//profile
	@RequestMapping(path="/myprofile.lti")
	public String registerp(RegisterEntity register,  HttpSession session) {
		registerService.register(register);
		//session.getAttribute("firstname");
			return "myprofile.jsp";
		}
	
	//logout
	@RequestMapping(path="/logout.lti")
		public String logout(RegisterEntity register, HttpSession session) {
		registerService.register(register);
	session.removeAttribute("firstname");
	session.removeAttribute("lastname");
	session.removeAttribute("email");
	session.removeAttribute("contact");
	return "login.jsp";
	//return "logout.jsp";
	}
	
	//login
	@RequestMapping(path = "/login.lti",method=RequestMethod.GET)
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String registration(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, HttpServletRequest request, Map model) {
		RegisterEntity register = registerService.get(email, password);
		model.put("register", register);
		String em=register.getEmail();
		String pswd=register.getPassword();
		
		if (em.equals("admin@gmail.com") && pswd.equals("admin"))
			{
			session= request.getSession();
			
			return "index.jsp";
			}
		
			else
			{	session= request.getSession();
			session.setAttribute("firstname",register.getFirstName() );
			session.setAttribute("lastname",register.getLastName() );
			session.setAttribute("email",register.getEmail() );
			session.setAttribute("contact",register.getContact() );
			session.setAttribute("user_id", register.getUserid());
			return "homepage.jsp";
			}
		
	}
	
	
	//send mail
	@RequestMapping(path = "/sendmail.lti")
	public String mail(@RequestParam("email") String email) 
	{
		Sendmail sendmail = new Sendmail();
		sendmail.sendmail(email);
		return "reset.jsp";
	}
	
	//change password
	@RequestMapping(path = "/changepwd.lti")
	public String change(@RequestParam("email") String email, @RequestParam("contact") String contact, @RequestParam("password") String password) 
	{
		changePasswordService.changepassword(email,contact,password);
		return "success.jsp";
	}
	
}
	
