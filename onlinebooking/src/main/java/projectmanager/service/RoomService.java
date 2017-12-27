package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.RoomRespository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRespository roomRespository;

}
