package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.lti.entity.*;
import com.lti.service.BookingService;



@Controller
//@SessionAttributes("bussender")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	List buslist;
	
	
//	public Admin ad;
	
	@RequestMapping(path = "/findbus.lti")
	public ModelAndView findbus(@RequestParam("doj") String dojour, @RequestParam("source") String so,@RequestParam("destination") String de,HttpSession session,Map model,HttpServletRequest request) {
		//Route route=bookingService.findbusId(so,de);
		
		
		ModelAndView mav1 = new ModelAndView("displaybus.jsp");
		 //System.out.println(request.getParameter("source"));
		// System.out.println(request.getParameter("destination"));
		 session=request.getSession(true);
		 
		 session.setAttribute("r_source",so);
		 session.setAttribute("r_destination", de);
		 session.setAttribute("doj", dojour);
		 int busid=bookingService.findbusId(so,de);
		 //System.out.println(busid);
		 session.setAttribute("bus_sr_id", busid);
		mav1.addObject("source", request.getParameter("source"));
		 mav1.addObject("destination",request.getParameter("destination"));
		 mav1.addObject("dateofj",request.getParameter("doj"));
		 
		 /*mav1.addObject("mavpassed",bookingService.findbus(so,de));*/
		List<Admin> adminlist=(List<Admin>) bookingService.findbus(so,de);
		
		mav1.addObject("adminval", adminlist);
		//model.put("buslist",buslist);	//System.out.println(mav1);
		return mav1;
	}
	
	@RequestMapping(value = "/bookticket.lti", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("booking.jsp");
	   
	    return mav;
	  }
	
	
	@RequestMapping(path="/bookingProcess.lti")
	public String bookSeat(UserBooking userbk,HttpSession session,HttpServletRequest request) {
		bookingService.bookSeat(userbk);
		
		session= request.getSession();
		//session.setAttribute("bus_comp_name", ad.getBusName());
		session.setAttribute("userid",userbk.getUserId());
		session.setAttribute("userbkid",userbk.getBkId());
		session.setAttribute("bkseats",userbk.getBkSeats());
		session.setAttribute("bussrid",userbk.getBusSrId());
		session.setAttribute("src", userbk.getSource());
		session.setAttribute("dest", userbk.getDestination());
		session.setAttribute("doj", userbk.getJourneyDate());
		session.setAttribute("totprice", userbk.getTotalPrice());

		
			return "showticket.jsp";
		}
	
	
	
		
	
	
}
