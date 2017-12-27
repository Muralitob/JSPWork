package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.CustomerRespository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRespository customerRespository;

}
