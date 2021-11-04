package com.example.mitimiti.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mitimiti.controllers.basecontrollers.BaseUserController;

@Controller
@RequestMapping("/user/evento")
public class EventController extends BaseUserController {

	
	@PostMapping()
	public String createEvento ( 	@RequestParam("name") String name,
									@RequestParam("participantes[]") List<String> participantes) {
		
		System.err.println(name);
		
		for (String id : participantes) {
			System.out.println(id);
		}
		
		try {
			
		} catch (Exception e) {
			return this.errorHandle(e);
		}
		
		return "redirect:/user";
	}

	@Override
	public String errorHandle(Exception e) {
		
		return super.REDIRECT_TO_PANEL.concat("?err=").concat(e.getMessage());
		
	}
	
}
