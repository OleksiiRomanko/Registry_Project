package com.kp_42.Controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 14.04.2016.
 */

public class GlobalDefaultExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";


    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e){

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }


}
