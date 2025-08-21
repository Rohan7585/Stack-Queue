package com.example.Stack.Queue.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Stack.Queue.Model.StructureModel;
import com.example.Stack.Queue.Services.StackService;

@RestController
@RequestMapping("/stack")
public class StackController {
	private final StackService stack;
	
	public StackController(StackService stack) {
		this.stack= stack;	
	}
	
	@GetMapping()
	 public String display() {
		 return stack.display();
	 }
	
	@PostMapping()
	 public String push(@RequestBody  StructureModel structureModel){
		if(structureModel == null || structureModel.getData() == "")	return "Please, Enter an input";
		 return stack.push(Integer.parseInt(structureModel.getData()));
	 }
	 
	@GetMapping("/pop")
	 public String pop() {
		 return stack.pop();
	}
	
	@GetMapping("/top")
	 public String top() {
		 return stack.top();
	 }
	
	@GetMapping("/len")
	 public String len() {
		 return stack.len();
	 }
	
}
