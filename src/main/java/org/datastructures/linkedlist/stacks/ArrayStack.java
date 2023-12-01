package org.datastructures.linkedlist.stacks;

import org.datastructures.linkedlist.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[]stack;
    private int size;
    private int top;

    public ArrayStack(int capacity) {
        stack=new Employee[capacity];
    }
    public boolean is_empty(){
        return top==0;
    }
    public void push(Employee employee){
        if(top==size){
           Employee[] newEmployees=new Employee[2* stack.length];
           System.arraycopy(stack,0,newEmployees,0,stack.length);
           stack=newEmployees;
        }
        stack[size++]=employee;

    }
    public Employee pop(){
        if(is_empty()){
            throw new EmptyStackException();
        }
       Employee employee=stack[top--];
       stack[top]=null;
       return employee;
    }
    public Employee peek(){
        if(is_empty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

}
