package com.a3zones.partsonline.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		ModelAndView mView = new ModelAndView("error");
		mView.addObject("errorTitle", "This Page is not Constructed");
		mView.addObject("errorDescription", "The Page you are looking for is not available");
		mView.addObject("title", "404 Error Page");
		return mView;
	}

}
