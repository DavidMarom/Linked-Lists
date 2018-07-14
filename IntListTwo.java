package com.company;

public class IntListTwo {

    private IntNodeTwo _head;
    private IntNodeTwo _tail;

    public IntListTwo() { // Empty Constructor
        _head = null;
        _tail = null;
    }

    public void insertAfter(int num, IntListTwo node) {
        IntNodeTwo temp = new IntNodeTwo(num);
        if (_head == null) {
            _head = temp;
            _tail = _head;
        } else {

            IntNodeTwo curr = _head;
            while (curr != node)
                curr = curr.getNext();

            temp.setNext(curr.getNext());
            temp.setPrev(curr);
            curr.setNext(temp);
            if (temp.getNext() == null)
                _tail = temp;
            else
                temp.getNext().setPrev(temp);
        }
    } // insertAfter





}
