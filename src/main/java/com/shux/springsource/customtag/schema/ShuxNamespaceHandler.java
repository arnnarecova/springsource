package com.shux.springsource.customtag.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.shux.springsource.customtag.parser.ServiceBeanDefinitionParser;

public class ShuxNamespaceHandler extends NamespaceHandlerSupport{

	@Override
	public void init() {
		registerBeanDefinitionParser("service",new ServiceBeanDefinitionParser());
	}
}
