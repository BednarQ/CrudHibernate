package com.crud.spring.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.spring.entity.Lokal;
@Repository
public class LocalDAOImpl implements LocalDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Lokal> getAllLocals(Integer ocena) {
		Session currentSession = sessionFactory.getCurrentSession();
		Transaction tx = null;
		@SuppressWarnings("deprecation")
		Criteria cr = currentSession.createCriteria(Lokal.class);
		addRestrictionIfNotNull(cr, "rating",ocena);
		List<Lokal> results = cr.list();
		//return the results
		return results;
	}
	private void addRestrictionIfNotNull(Criteria criteria, String propertyName, Object value) {
	    if (value != null) {
	        criteria.add(Restrictions.eq(propertyName, value));
	    }
	}


}
