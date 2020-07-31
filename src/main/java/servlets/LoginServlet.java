package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.UserDaoController;

@Controller

public class LoginServlet {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("loginError.jsp");
		

		UserDaoController userDaoController = new UserDaoController();
		
		userDaoController.isLoginExist(request.getParameter("login"));
		
		if(userDaoController.isLoginExist(request.getParameter("login"))) {
			modelAndView.setViewName("loginSuccess.jsp");
		}else {modelAndView.setViewName("loginError.jsp");}

		
		return  modelAndView;
	}
	
}


//		if(request.getParameter("login").equals("abc") && request.getParameter("pass").equals("123")) {
//			modelAndView.setViewName("loginSuccess.jsp");
//		}else {modelAndView.setViewName("loginError.jsp");
//		}
