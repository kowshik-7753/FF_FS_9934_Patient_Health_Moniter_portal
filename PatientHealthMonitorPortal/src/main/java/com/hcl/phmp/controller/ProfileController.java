package com.hcl.phmp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.phmp.model.Profile;
import com.hcl.phmp.service.UserServiceImpl;
@Controller
@RequestMapping("/user")
public class ProfileController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public ModelAndView add(@Valid Profile profile, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("profile");
		} else {
			if (userService.profile(profile))
				return new ModelAndView("home");
			else
				return new ModelAndView("profileFailed");
		}
	}
	@RequestMapping("/profile")
	public ModelAndView add() {
		return new ModelAndView("profile", "profile", new Profile());

	}
}
