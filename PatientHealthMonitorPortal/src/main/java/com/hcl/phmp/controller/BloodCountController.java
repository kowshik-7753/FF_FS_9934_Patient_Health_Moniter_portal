/**
 * 
 */
package com.hcl.phmp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.phmp.model.BloodCount;
import com.hcl.phmp.model.Login;
import com.hcl.phmp.service.UserServiceImpl;

/**
 * @author kowshik.kotha
 *
 */
@Controller
@RequestMapping("/user")
public class BloodCountController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/bloodCount", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid BloodCount bloodCount, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("bloodCount");
		} else {
			if (userService.bloodCount(bloodCount)) {
				ModelAndView mav = new ModelAndView();
				List<BloodCount> list = userService.bloodCount(bloodCount.getPatientId());
				//list.stream().forEach(var->{System.out.println(var.getRbc()+" "+var.getWbc());});
				mav.addObject("list", list);
				mav.setViewName("bloodCountDisplay");
				return mav;
			} else
				return new ModelAndView("loginFailed"); 
		}
	}

	@RequestMapping("/bloodCount")
	public ModelAndView add() {
		return new ModelAndView("bloodCount", "bloodCount", new BloodCount());

	}

}
