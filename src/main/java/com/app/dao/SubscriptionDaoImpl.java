package com.app.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.app.entity.common.SubscriptionPlans;

@Repository
public class SubscriptionDaoImpl implements SubscriptionDao {

	@Autowired
	@Qualifier("db1SessionFactory")
	SessionFactory db1SessionFactory;

	@Autowired
	@Qualifier("db2SessionFactory")
	SessionFactory db2SessionFactory;

	@Override
	public SubscriptionPlans addPlan(SubscriptionPlans addPlan) {
		Session session = db1SessionFactory.getCurrentSession();
		session.save(addPlan);
		return addPlan;
	}

	@Override
	public SubscriptionPlans getPlan(Long planId) {
		Session session = db1SessionFactory.getCurrentSession();
		String hql = "from SubscriptionPlans where planId =:planId";
		Query query = session.createQuery(hql);
		query.setParameter("planId", planId);

		return (SubscriptionPlans) query.uniqueResult();
	}

	@Override
	public SubscriptionPlans updatePlan(SubscriptionPlans updatePlan) {
		Session session = db1SessionFactory.getCurrentSession();
		session.saveOrUpdate(updatePlan);
		return updatePlan;
	}

	@Override
	public SubscriptionPlans addPlan2(SubscriptionPlans addPlan) {
		Session session = db2SessionFactory.getCurrentSession();
		session.save(addPlan);
		return addPlan;
	}

	@Override
	public SubscriptionPlans getPlan2(Long planId) {
		Session session = db2SessionFactory.getCurrentSession();
		String hql = "from SubscriptionPlans where planId =:planId";
		Query query = session.createQuery(hql);
		query.setParameter("planId", planId);

		return (SubscriptionPlans) query.uniqueResult();
	}

	@Override
	
	public SubscriptionPlans updatePlan2(SubscriptionPlans updatePlan) {
		Session session = db2SessionFactory.getCurrentSession();
		session.saveOrUpdate(updatePlan);
		return updatePlan;
	}

}
