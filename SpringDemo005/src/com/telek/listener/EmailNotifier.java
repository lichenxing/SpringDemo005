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
    //�÷����������������¼�ʱ�Զ�����
	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof EmailEvent){
			// ֻ����EmailEvent������Email֪ͨ..
			EmailEvent emailEvent = (EmailEvent) evt;
			System.out.println("��Ҫ�����ʼ��Ľ��յ�ַ  "+emailEvent.getAddress());
			System.out.println("��Ҫ�����ʼ����ʼ�����  "+emailEvent.getText());
	
		}else{
			//���������¼������κδ���
			System.out.println("����������¼� "+evt);
		}
	}

}
