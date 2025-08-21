package com.example.Stack.Queue.Utility;

public class StackImplementation {
	private long front = -1,  rear  =  -1,  len =  0;
    private StackNode head = null;
    private String nullStr  = "The Stack is empty";
    
    public String push(int data){
        StackNode newNode = new StackNode(data);
        if(head == null &&  front==-1 && rear==-1){
            head = newNode;
            front++;
        }else{
            newNode.next =  head;
            head = newNode;
        }
        rear++;
        len++;
        return data+" pushed";
    }

    public String pop(){
        if(head == null  &&  front==-1 && rear==-1)     return nullStr;
        if(front ==  rear)  front--;
        int removeData = head.data;
        head  = head.next;
        rear--;
        len--;
        return removeData+" popped";
    }

    public String display(){
        if(head == null  &&  front==-1 && rear==-1)     return nullStr;
        StackNode temp = head;
        StringBuilder str =  new StringBuilder();
        str.append("TOP <-  ");
        while(temp.next!=null){
            str.append(String.valueOf(temp.data));
            str.append(",  ");
            temp =  temp.next;
        }
        str.append(String.valueOf(temp.data) + " <- Bottom");
        return str.toString();
    }

    public String top(){
        if(head == null  &&  front==-1 && rear==-1)     return nullStr;
        return "Top: " + head.data;
    }

    public String len(){
        return "Length: "+len;
    }
}

class StackNode {
    int data;
    StackNode next;

    public StackNode(int data){
        this.data = data;
        this.next = null;
    }
}
