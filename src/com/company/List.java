package com.company;
/**
* @author Andrey Sarychev
*/

public class List {
    /** data - переменная, которая хранит какое-то значение */
    public int data;
    /** next - указатель на след. элемент списка */
    public List next;

    List(int data, List next) {
        this.data = data;
        this.next = next;
    }

}

