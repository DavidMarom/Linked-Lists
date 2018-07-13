package com.company;

public class IntNode {

    private int _value;                     // _value
    private IntNode _next;                  // _next


    public IntNode(int val) {               // CONSTRUCTOR
        _value = val;
        _next = null;
    }

    public IntNode(int val, IntNode next) { // CONSTRUCTOR
        _value = val;
        _next = next;
    }

    public int getValue() {                 // getValue
        return _value;
    }

    public void setValue(int v) {           // setValue
        _value = v;
    }

    public IntNode getNext() {              // getNext
        return _next;
    }

    public void setNext(IntNode node) {     // setNext
        _next = node;
    }
}
