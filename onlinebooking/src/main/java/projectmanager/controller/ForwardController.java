package projectmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import projectmanager.model.RoomType;
import projectmanager.service.RoomTypeService;

@Controller
@RequestMapping("/")
public class ForwardController {
	
    @Autowired
    private RoomTypeService roomTypeService;

    @RequestMapping({"","/index"})
    public String index(Model model) {
        List<RoomType> roomTypeList = roomTypeService.getRoomType();
        model.addAttribute("list", roomTypeList);
        return "index";
    }
    
    @RequestMapping("/searchorder")
    public String searchorder() {
        return "searchorder";
    }
    
    @RequestMapping("/bookform")
    public String bookform() {
        return "bookform";
    }
}
