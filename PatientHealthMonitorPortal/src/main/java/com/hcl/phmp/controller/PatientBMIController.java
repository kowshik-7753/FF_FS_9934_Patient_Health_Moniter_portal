package com.hcl.phmp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.PatientBMI;
import com.hcl.phmp.service.UserServiceImpl;
@Controller
@RequestMapping("/user")
public class PatientBMIController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/bmiCalculator", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid PatientBMI patientBMI , BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("bmiCalculator");
		} else {
			if (userService.bmiCalculator(patientBMI))
				return new ModelAndView("home");
			else
				return new ModelAndView("loginFailed");
		}
	}
	@RequestMapping("/bmiCalculator")
    public ModelAndView add() {
        // return new ModelAndView("redirect:user/login");
        return new ModelAndView("bmiCalculator", "bmiCalculator", new PatientBMI());

	}
}
