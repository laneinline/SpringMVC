package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.AddService;

@Controller
public class AddServlet {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView modelAndView = new ModelAndView();
		int result;
		AddService addService = new AddService();
		
		
		result = addService.add(Integer.valueOf(request.getParameter("text1")), Integer.valueOf(request.getParameter("text2")));
		
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("result",result);
		return modelAndView;

	}
}
