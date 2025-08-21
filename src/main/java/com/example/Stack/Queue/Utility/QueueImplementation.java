package com.example.Stack.Queue.Utility;

class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data){
        this.data = data;
        next =  null;
    }
}

public class QueueImplementation {
	    private int front=-1, tail=-1, len = 0;
	    private String nullStr= "The queue is empty";
    private QueueNode head;
    private QueueNode frontNode;

    public String dequeue(){
        if(head == null && front==-1 && tail ==-1)  return nullStr;
        int removedData = head.data;
        head = head.next;
        len--;
        tail--;
        if(head == null)    front=-1;
        return removedData+" dequeued";
    }

    public String enqueue(int data){
        QueueNode newNode = new QueueNode(data);
        if(head == null && front==-1 && tail ==-1){
            head = newNode;
            frontNode = head;
            front++;
        }else{
            frontNode.next = newNode;
            frontNode = frontNode.next;
        }
        tail++;
        len++;
        return data+" enqueued";
    }

    public String display(){
        if(head == null  &&  front==-1 && tail==-1)     return nullStr;
        QueueNode temp = head;
        StringBuilder str =  new StringBuilder();
        str.append("Exit <= ");
        while(temp.next!=null){
            str.append(String.valueOf(temp.data));
            str.append(" <=  ");
            temp =  temp.next;
        }
        str.append(String.valueOf(temp.data));
        str.append(" <= Enter");
        return str.toString();
    }
    public String len(){
        return String.valueOf(len);
    }
}
