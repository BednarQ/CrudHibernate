package com.crud.spring.controller;

import com.crud.spring.dao.*;
import com.crud.spring.entity.Lokal;
import com.crud.spring.entity.Ocena;
import com.crud.spring.service.LocalService;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lokal")
public class ReadController {
	
	@Autowired
	private LocalService localService;
	
	@GetMapping("/list")
	public String listLocals(@RequestParam(value="ocena", required=false) Integer ocena, Model theModel){
	
		//get local from the service
		List<Lokal> theLocals = localService.getLocals(ocena);
		List<Ocena> theResults = localService.getResults();
		
		//add the customers to the model
		theModel.addAttribute("locals", theLocals);
		theModel.addAttribute("ocena",ocena);
		
		return "list-local";
	}
	@GetMapping("/search")
	public String searchForm(Model theModel){
		return "form";
		
	}
	
}
