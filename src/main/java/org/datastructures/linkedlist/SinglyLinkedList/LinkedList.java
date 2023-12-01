package org.datastructures.linkedlist.SinglyLinkedList;

import org.datastructures.linkedlist.Employee;

public class LinkedList {
    private Node head;
    private int  size;
    public boolean is_empty(){
        return head==null?true:false;
    }
    public void addToList(Employee employee) {
        Node node = new Node(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    public void removeFromList(){
        if(head==null){
            System.out.println("this list is empty");
        } else{
            head=head.getNext();
            size--;
        }
    }
    public void print_linked_list(){
        Node navigate=head;
        System.out.print("head==>");
        if (navigate==null){
            System.out.println("this list is empty");
        }
        while(navigate!=null){
            System.out.print("{"+navigate.getEmployee().getFirstName()+","+navigate.getEmployee().getLastName()+","+navigate.getEmployee().getId()+"}");
            System.out.print("==>");
            navigate=navigate.getNext();
        }
        System.out.print("end");
    }
}
