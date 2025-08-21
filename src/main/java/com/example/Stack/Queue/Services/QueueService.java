package com.example.Stack.Queue.Services;

import org.springframework.stereotype.Service;

import com.example.Stack.Queue.Utility.QueueImplementation;

@Service
public class QueueService {
	private QueueImplementation queue =  new QueueImplementation();
	
	public String dequeue() {
		return queue.dequeue();
	}
	 public String enqueue(int data) {
		 return queue.enqueue(data);
	 }
	 public String display(){
		 return queue.display();
	 }
	 public String len(){
		 return queue.len();
	 }
}
