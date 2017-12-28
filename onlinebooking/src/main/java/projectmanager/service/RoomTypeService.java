package projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.model.RoomType;
import projectmanager.repository.RoomTypeRepository;

@Service
public class RoomTypeService {

 	@Autowired
 	private RoomTypeRepository roomTypeRepository;

    
    public List<RoomType> getRoomType() {
        return roomTypeRepository.findAll();
    }
}
