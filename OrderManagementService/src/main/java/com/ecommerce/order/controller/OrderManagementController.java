package com.ecommerce.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order.model.OrderDetails;

@RestController
@RequestMapping("/order")
public class OrderManagementController {
	
	@Value("${greeting}")
	private String msg;
	
	@GetMapping("/getOrderDetails")
	public OrderDetails getOrderDetails() {
		System.out.println(this.msg);
		OrderDetails order = new OrderDetails();
		order.setOrderId("1234");
		order.setProductName("laptop");
		order.setPrice("60000");
		return order;
	}

}
