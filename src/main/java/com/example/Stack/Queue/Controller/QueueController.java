package com.example.Stack.Queue.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Stack.Queue.Model.StructureModel;
import com.example.Stack.Queue.Services.QueueService;

@RestController
@RequestMapping("/queue")
public class QueueController {

	private final QueueService queue;
	
	public QueueController(QueueService queue) {
		this.queue =  queue;
	}

	 @GetMapping()
	 public String display(){
		 return queue.display();
	 }
	 
	 @PostMapping()
	 public String enqueue(@RequestBody StructureModel structureModel) {
		 return queue.enqueue(Integer.parseInt(structureModel.getData()));
	 }
	
	 
	@GetMapping("/dequeue")
	public String dequeue() {
		return queue.dequeue();
	}
	
	 @GetMapping("/len")
	 public String len(){
		 return queue.len();
	 }
}
