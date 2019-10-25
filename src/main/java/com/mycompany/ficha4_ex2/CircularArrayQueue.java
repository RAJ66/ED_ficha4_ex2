/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha4_ex2;

/**
 *
 * @author vitor
 */
public class CircularArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int front;
    private int rear;
    private T[] queue;
    private int count;

    public CircularArrayQueue() {
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public CircularArrayQueue(int initialCapacity) {
        this.front = 0;
        this.rear = 0;
        this.count = 0;

        this.queue = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void enqueue(T element) {
        //v1
        this.queue[this.rear] = element;
        this.rear = (this.rear + 1) % this.queue.length;
        this.count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T first() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return this.count;
    }
    
    @Override

    public String toString() {
        /*
        String s = "";
        s = s+"\nTop:"+this.top+" Tamanho:"+this.stack.length+"\n";
        for (int i = 0; i < this.size(); i++) {
            s=s+this.stack[i]+"//";
        }
        return s;
         */
        StringBuilder str = new StringBuilder();
        str.append("\nFront: ");
        str.append(this.front+"-"+this.queue[this.front]);

        str.append("\nRear: ");
        str.append(this.rear+"-"+this.queue[this.rear]);

        str.append(" Tamanho:");
        str.append(this.count);
        str.append("\n");
        for (int i = 0; i < this.size(); i++) {
            str.append(this.queue[i]);
            str.append("//");
        }

        return str.toString();
    }

}
