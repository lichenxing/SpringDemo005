/**
 * 
 */
package com.telek.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.telek.event.EmailEvent;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("rawtypes")
public class EmailNotifier implements ApplicationListener {
    //该方法会在容器发生事件时自动触发
	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof EmailEvent){
			// 只处理EmailEvent，发送Email通知..
			EmailEvent emailEvent = (EmailEvent) evt;
			System.out.println("需要发送邮件的接收地址  "+emailEvent.getAddress());
			System.out.println("需要发送邮件的邮件正文  "+emailEvent.getText());
	
		}else{
			//容器内置事件不作任何处理
			System.out.println("容器本身的事件 "+evt);
		}
	}

}
