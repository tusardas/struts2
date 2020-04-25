package com.heytusar.struts2.service;

import java.util.List;

import com.heytusar.struts2.persistance.NewsPersistance;
import com.heytusar.struts2.model.News;

public class NewsService {
	private NewsPersistance newsPersistance;
	
	
	public NewsPersistance getNewsPersistance() {
		return newsPersistance;
	}


	public void setNewsPersistance(NewsPersistance newsPersistance) {
		this.newsPersistance = newsPersistance;
	}


	public List<News> newsListing() {
		return newsPersistance.newsListing();
	}
}
