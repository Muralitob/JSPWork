package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userRespository;

}
