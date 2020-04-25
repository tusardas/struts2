package com.heytusar.struts2.persistance;

import com.heytusar.struts2.model.News;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class NewsPersistance extends BasePersistenceImpl {
	@SuppressWarnings("unchecked")
	public List<News> newsListing() {
		Criteria criteria = getSession().createCriteria(News.class);
		//criteria.add(Restrictions.eq("userCategory", "admin"));
		return criteria.list();
	}
}
