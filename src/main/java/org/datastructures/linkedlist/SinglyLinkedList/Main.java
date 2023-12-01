package org.datastructures.linkedlist.SinglyLinkedList;

import org.datastructures.linkedlist.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ahmed","Mohamed",1);
        Employee employee2=new Employee("Ahmed","sabir",2);
        Employee employee3=new Employee("Ahmed","houdaifa",3);
        LinkedList linkedList=new LinkedList();
        linkedList.addToList(employee1);
        linkedList.addToList(employee2);
        linkedList.addToList(employee3);
        linkedList.print_linked_list();
        linkedList.removeFromList();
        System.out.println("");
        linkedList.print_linked_list();
    }
}