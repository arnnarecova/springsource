package com.shux.springsource.customtag.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.shux.springsource.customtag.ServiceBean;
/**
 * 
 * @author Administrator
 *
 */
public class ServiceBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{
	protected Class<ServiceBean> getBeanClass(Element element) {
		return ServiceBean.class;
	}
	protected void doParse(Element element,BeanDefinitionBuilder bean) {
		String id = element.getAttribute("id");
		bean.addPropertyValue("id", id);
		String interfaces = element.getAttribute("interfaces");
		String ref = element.getAttribute("ref");
		if (StringUtils.hasText(interfaces)) {
			bean.addPropertyValue("interfaces", interfaces);
		}
		
		if (StringUtils.hasText(ref)) {
			bean.addPropertyValue("ref", ref);
		}
	}
}
