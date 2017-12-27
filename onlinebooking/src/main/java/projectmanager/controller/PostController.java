package projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projectmanager.service.PostService;

@Controller
@RequestMapping("/basis/customer")
public class PostController {
	
	@Autowired
	private PostService postService;

}
