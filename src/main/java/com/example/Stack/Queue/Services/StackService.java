package com.example.Stack.Queue.Services;

import org.springframework.stereotype.Service;

import com.example.Stack.Queue.Utility.StackImplementation;

@Service
public class StackService {
	
	private StackImplementation  stack = new StackImplementation();
	
	public String push(int data){
		 return stack.push(data);
	 }
	 
	 public String pop() {
		 return stack.pop();
	}
	 
	 public String display() {
		 return stack.display();
	 }
	 
	 public String top() {
		 return stack.top();
	 }
	 
	 public String len() {
		 return stack.len();
	 }
}
