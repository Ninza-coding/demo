package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.model.Cricketer;
import com.service.MyService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	private MyService myservice;
	@Autowired
	public void setMyservice(MyService myservice) {
		this.myservice = myservice;
	}

	@GetMapping(path = { "/", "index" })
	public String welcomeView() {
		return "index";
	}

	@GetMapping(path = "insert")
	public String insertView() {
		return "insert";
	}


	@PostMapping("insert")
	public String insertData(@ModelAttribute Cricketer cricketer, Model model, 
			RedirectAttributes redirectAttributes) {
		String result = myservice.saveMyData(cricketer);
		//model.addAttribute("msg", result);
		redirectAttributes.addFlashAttribute("msg", result);
		return "redirect:/insert";
	}
	@GetMapping(path="read")
	public String readAlldata(Model model){
		List<Cricketer> list = myservice.readMyData();
		model.addAttribute("data", list);
		System.out.println(list);
		return "read";
	}
	@GetMapping("deletefromread")
	public String getMethodName(@RequestParam("id") int id, RedirectAttributes redatt) {
		String deleteMyData = myservice.deleteMyData(id);
		System.out.println(id);
		redatt.addFlashAttribute("msg", deleteMyData);
		return "redirect:/read";
	}
}
