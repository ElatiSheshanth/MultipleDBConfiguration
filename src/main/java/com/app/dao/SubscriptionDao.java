package com.app.dao;

import com.app.entity.common.SubscriptionPlans;

public interface SubscriptionDao {

	SubscriptionPlans addPlan(SubscriptionPlans addPlan);

	SubscriptionPlans getPlan(Long planId);

	SubscriptionPlans updatePlan(SubscriptionPlans updatePlan);

	SubscriptionPlans addPlan2(SubscriptionPlans addPlan);

	SubscriptionPlans getPlan2(Long planId);

	SubscriptionPlans updatePlan2(SubscriptionPlans updatePlan);
	
}
