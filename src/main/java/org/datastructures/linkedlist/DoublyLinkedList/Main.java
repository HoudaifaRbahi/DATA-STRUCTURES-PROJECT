package org.datastructures.linkedlist.DoublyLinkedList;

import org.datastructures.linkedlist.Employee;
public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ahmed","Mohamed",1);
        Employee employee2=new Employee("Ahmed","sabir",2);
        Employee employee3=new Employee("Ahmed","houdaifa",3);
        LinkedList linkedList=new LinkedList();
        linkedList.addToFront(employee1);
        linkedList.addToFront(employee2);
        linkedList.print_linked_list();
        linkedList.addBefore(employee2,employee3);
        System.out.println("");
        linkedList.print_linked_list();

    }
}
