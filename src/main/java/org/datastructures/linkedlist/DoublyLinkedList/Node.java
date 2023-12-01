package org.datastructures.linkedlist.DoublyLinkedList;

import org.datastructures.linkedlist.Employee;

public class Node {
    private Node previous;
    private Employee employee;
    private Node next;

    public Node(Employee employee) {
        this.employee = employee;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
