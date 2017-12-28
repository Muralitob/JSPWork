package projectmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projectmanager.model.RoomType;
import projectmanager.service.RoomTypeService;

@Controller
@RequestMapping("/roomType")
public class RoomTypeController {
	
	@Autowired
	private RoomTypeService roomTypeService;


}
