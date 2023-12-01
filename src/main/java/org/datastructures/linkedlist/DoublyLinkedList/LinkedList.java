package org.datastructures.linkedlist.DoublyLinkedList;

import org.datastructures.linkedlist.Employee;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public boolean is_empty(){
        return head==null;
    }
    public void addToFront(Employee employee){
        Node node=new Node(employee);
        if(head==null){
          tail=node;
        }
        else {
            node.setNext(head);
            head.setPrevious(node);
        }
        head = node;
        size++;
    }
    public void addToEnd(Employee employee){
        Node node=new Node(employee);
        Node current=head;
        if(head==null){
            head=node;
        }
        else{
            while (current!=null){
                current=current.getNext();
            }
            current.setNext(node);
            current=current.getNext();
        }
        tail=current;
        size++;
    }
    public Node removeFromFront(){
        Node node=head;
        if(is_empty()){
            return  null;
        }
        if(head.getNext()==null){
            tail=null;
        }
        else{
            head=head.getNext();
            head.setPrevious(null);
        }
        node.setNext(null);
        size--;
        return node;
    }
    public Node removeFromEnd(){
        Node node=tail;
        if(head==null){
            return null;
        }
        else{
            if(node.getPrevious()==null){
                head=null;
            }
            else{
                if(node.getPrevious().getPrevious()==null){
                    head=node.getPrevious();
                }
                tail=tail.getPrevious();
                tail.setNext(null);
            }
        }
        size--;
        return node;

    }
    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        // add your code here
        if(head==null){
            return false;
        }
        Node node=head;
        while(node!=null&&!node.getEmployee().equals(existingEmployee)){
            node=node.getNext();
        }
        if(node==null){
            System.out.println("the existing employee that you have send it's not exist in the list");
        }
        /*node.getPrevious().setNext(newNode);
        node.setPrevious(newNode);
        newNode.setNext(node);
        node.setPrevious(node.getPrevious());

         */
        Node newNode=new Node(newEmployee);
        newNode.setNext(node);
        node.setPrevious(newNode);
        if(head==node){
            head=newNode;

        }
        else{
            node.getPrevious().setNext(newNode);
        }
       size++;

        return true;
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
