package com.shux.springsource.beanpost;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * 描述：
 * 
 * <pre>HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2017年12月18日      Simba.Hua         Create
 * ****************************************************************************
 * </pre>
 * @author Simba.Hua
 */
public class MyInstantiationAwareBeanPostProcessor extends
		InstantiationAwareBeanPostProcessorAdapter {

	
	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor 构造器");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass,
			String beanName) throws BeansException {
		System.out.println("执行MyInstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation方法");
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException {
		System.out.println("执行MyInstantiationAwareBeanPostProcessor的postProcessPropertyValues方法");
		return super.postProcessPropertyValues(pvs, pds, bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("执行MyInstantiationAwareBeanPostProcessor的postProcessAfterInitialization方法");
		return super.postProcessAfterInitialization(bean, beanName);
	}
	
}
