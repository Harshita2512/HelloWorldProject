package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class FirstController {
	
	@RequestMapping("/print")
	public ModelAndView printHello(String t1) {
		ModelAndView mw = new ModelAndView();
		mw.setViewName("/display.jsp");
		mw.addObject("name", t1);
		return mw;
	}

}
