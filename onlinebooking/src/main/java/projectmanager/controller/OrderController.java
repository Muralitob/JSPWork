package projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projectmanager.service.OrderService;

@Controller
@RequestMapping("/basis/customer")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

}
