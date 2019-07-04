package com.first;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.po.Items;

public class ItemController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//ʹ�þ�̬������ȥ��ʾ��jspҳ��
		List<Items> itemsList = new ArrayList<Items>();
		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000f);
		items_1.setCreatetime(new Date());
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");

		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6ƻ���ֻ���");

		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//��list�ŵ�ҳ��
		//request.setAttribute("itemsList", itemsList);
		
		ModelAndView modelAndView = new ModelAndView();
		//��������䵽request
		modelAndView.addObject("itemsList", itemsList);
		//ת����jspҳ�棬ָ��ת����jspҳ��
		modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");
		return modelAndView;
	}

}
