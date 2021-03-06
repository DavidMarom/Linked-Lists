package com.company;

public class IntNodeTwo {
    int _num;
    IntNodeTwo _next, _prev;

    public IntNodeTwo(int n) {
        _num = n;
        _next = null;
        _prev = null;
    }

    public IntNodeTwo(int num, IntNodeTwo n, IntNodeTwo p) {
        _num = num;
        _next = n;
        _prev = p;
    }

    public int getNum() {
        return _num;
    }

    public IntNodeTwo getNext() {
        return _next;
    }

    public IntNodeTwo getPrev() {
        return _prev;
    }

    public void setNum(int num) {
        _num = num;
    }

    public void setNext(IntNodeTwo n) {
        _next = n;
    }

    public void setPrev(IntNodeTwo n) {
        _prev = n;
    }


}
