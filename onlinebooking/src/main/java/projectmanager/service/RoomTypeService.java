package projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.respository.RoomTypeRespository;

@Service
public class RoomTypeService {
	
	@Autowired
	private RoomTypeRespository roomTypeRespository;

}
