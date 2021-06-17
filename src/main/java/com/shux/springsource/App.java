package com.shux.springsource;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.shux.springsource.beanfactory.MyBeanFactory;
import com.shux.springsource.beanfactory.User;
import com.shux.springsource.biz.IMyBeanBiz;
import com.shux.springsource.biz.impl.MyBeanBizImpl;
import com.shux.springsource.customtag.ServiceBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }
    @Test
    public void testCustomTag() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("customBean.xml");
    	ServiceBean bean = context.getBean("customtag", ServiceBean.class);
    	System.out.println(bean.getInterfaces());
    }
    @Test
    public void testCustomTag2() {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("customBean.xml"));
    	ServiceBean bean = factory.getBean("customtag", ServiceBean.class);
    	System.out.println(bean.getInterfaces());
    	System.out.println(bean.getRef());
    }
    
    @Test
    public void testSpringTag() {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("mybeans.xml"));
        IMyBeanBiz mybeanbiz = factory.getBean("mybean", MyBeanBizImpl.class);
        mybeanbiz.printName("simba");
    }
    
    @Test
    public void testMyfactoryBean() throws Exception {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("mybeans.xml"));
    	User mybeanbiz = factory.getBean("myfactorybean", User.class);
        mybeanbiz.printUsername("simba");
        System.out.println("-------------------------");
        MyBeanFactory mybeanFactory = factory.getBean("&myfactorybean", MyBeanFactory.class);
        mybeanFactory.getObject();
    }
    
    @Test
    public void testPostBeanProcessor() {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("mybeans.xml"));
    	
    	User user = factory.getBean("userBean",User.class);
    	user.printUsername("simba");
    }
    
}
