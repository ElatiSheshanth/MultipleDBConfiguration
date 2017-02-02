package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entity.common.SubscriptionPlans;
import com.app.service.SubscriptionService;

import io.swagger.annotations.ApiOperation;

@Controller
public class SubscriptionController {

	@Autowired
	SubscriptionService subscriptionService;
	
	@RequestMapping(value = "/addPlan", method = RequestMethod.POST)
	public @ResponseBody SubscriptionPlans addPlan(@RequestBody SubscriptionPlans addPlan) throws Exception {
		return subscriptionService.addPlan(addPlan);
	}
	
	@RequestMapping(value = "/getPlan/{planId}", method = RequestMethod.GET)
	public @ResponseBody SubscriptionPlans getPlan(@PathVariable("planId") Long planId) throws Exception {
		return subscriptionService.getPlan(planId);
	}
	
	@RequestMapping(value = "/updatePlan", method = RequestMethod.PUT)
	public @ResponseBody SubscriptionPlans subPlans(@RequestBody SubscriptionPlans updatePlan) throws Exception {
		return subscriptionService.updatePlan(updatePlan);
	}
	
	@RequestMapping(value = "/addPlan2", method = RequestMethod.POST)
	public @ResponseBody SubscriptionPlans addPlan2(@RequestBody SubscriptionPlans addPlan) throws Exception {
		subscriptionService.addPlan2(addPlan);
		throw new Exception();
	}
	
	@RequestMapping(value = "/getPlan2/{planId}", method = RequestMethod.GET)
	public @ResponseBody SubscriptionPlans getPlan2(@PathVariable("planId") Long planId) throws Exception {
		return subscriptionService.getPlan2(planId);
		
	}
	
	@RequestMapping(value = "/updatePlan2", method = RequestMethod.PUT)
	public @ResponseBody SubscriptionPlans subPlans2(@RequestBody SubscriptionPlans updatePlan) throws Exception {
		return subscriptionService.updatePlan2(updatePlan);
	}
	
}
