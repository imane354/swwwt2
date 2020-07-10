package de.fhdo.swt.example.swtexampleapplication.controller;

import de.fhdo.swt.example.swtexampleapplication.entity.User;
import de.fhdo.swt.example.swtexampleapplication.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class UserController {
/*
    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/user")
    public String createUser(@ModelAttribute User user) {
        return "user";
    }
    
*/
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/user",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	public List<User> getReise(){
		
		List<User> userListe = userRepository.findAll();
		return userListe;
	}
}
