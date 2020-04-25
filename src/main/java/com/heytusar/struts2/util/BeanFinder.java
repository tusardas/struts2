package com.heytusar.struts2.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class BeanFinder {
	private static ApplicationContext ctx = null;

	public static Object getBean(ServletRequest request, String beanName) {
		if (ctx == null) {
			if (!(request instanceof HttpServletRequest)) {
				throw new IllegalArgumentException("Can only process HttpServletRequest");
			}
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			ctx = getContext(httpRequest);
		}
		return ctx.getBean(beanName); 

	}

	public static ApplicationContext getContext(HttpServletRequest httpRequest) {

		return WebApplicationContextUtils.getRequiredWebApplicationContext(httpRequest.getSession().getServletContext());
	}
}
