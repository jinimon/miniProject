package co.jamong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// 나중에 사용자 코드로 바꿔야함
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

	@RequestMapping(value="/admin")
	public ModelAndView admin(HttpServletResponse response) throws IOException{
		return new ModelAndView("admin/dashboard");
	}
}
