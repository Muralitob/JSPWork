package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.OrderRespository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRespository orderRespository;

}
