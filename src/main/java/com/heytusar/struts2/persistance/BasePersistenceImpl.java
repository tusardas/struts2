package com.heytusar.struts2.persistance;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BasePersistenceImpl extends HibernateDaoSupport{
	public BasePersistenceImpl() {
		
	}
	 
	public void update(final Serializable object) {
		getHibernateTemplate().update(object);
	}

	public void save(final Serializable object) {
		getHibernateTemplate().save(object);
		getSession().flush();
	}

	public void delete(Serializable object){
		getHibernateTemplate().delete(object);
	}
	
}
