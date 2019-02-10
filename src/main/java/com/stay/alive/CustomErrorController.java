package com.stay.alive;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController{
	private static final String PATH = "/error";
	
    @RequestMapping(value = PATH)
    public String error(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (String.valueOf(status).equalsIgnoreCase(HttpStatus.NOT_FOUND.toString())) {
            return "index"; // /WEB-INF/errors/404.jsp
        }
        return "index";
    }
	public String getErrorPath() {
		return PATH;
	}
}
