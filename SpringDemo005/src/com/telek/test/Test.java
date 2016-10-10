/**
 * 
 */
package com.telek.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telek.event.EmailEvent;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
		//创建一个ApplicationEvent对象
		EmailEvent emailEvent = new EmailEvent("hello", "lcxsmr@sina.com", "this is a email!");
        //主动触发容器事件
		act.publishEvent(emailEvent);
	}

}
