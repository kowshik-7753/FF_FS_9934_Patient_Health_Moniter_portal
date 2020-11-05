package com.hcl.phmp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.phmp.model.Diabetes;
import com.hcl.phmp.model.Profile;
import com.hcl.phmp.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class DiabetesController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/diabetes", method = RequestMethod.POST)
	public ModelAndView add(@Valid Diabetes diabetes, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("diabetes");
		} else {
			if (userService.diabetes(diabetes))
				return new ModelAndView("home");
			else
				return new ModelAndView("profileFailed");
		}
	}
	@RequestMapping("/diabetes")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("diabetes", "diabetes", new Diabetes());

	}
}
