package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.PostRespository;

@Service
public class PostService {
	
	@Autowired
	private PostRespository postRespository;

}
