package com.heytusar.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import com.heytusar.struts2.model.News;
import com.heytusar.struts2.service.NewsService;
import com.heytusar.struts2.util.BeanFinder;

public class NewsAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest servletRequest;
	private List<News> newsList;
	
	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}
	
	public String newsListing() {
		NewsService newsService = (NewsService) BeanFinder.getContext(servletRequest).getBean("newsService");
		this.setNewsList(newsService.newsListing());
		return "success";
	}

	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest =  request;
	}
}
