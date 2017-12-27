package projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projectmanager.service.CustomerService;

@Controller
@RequestMapping("/basis/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

}
