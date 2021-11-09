package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void TestAddElementToList() {
        try {
            Container list = new Container();
            list.addElementToArray(3);
            list.addElementToArray(5);
            list.addElementToArray(6);
            assertEquals("3 5 6", list.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @org.junit.jupiter.api.Test
    void TestRemoveElement() {
        try {
            Container list = new Container();
            list.addElementToArray(3);
            list.addElementToArray(5);
            list.addElementToArray(8);
            list.addElementToArray(15);
            list.addElementToArray(42);
            list.removeElement(8);
            list.removeElement(42);
            list.removeElement(3);
            assertEquals("5 15", list.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void TestPopElement() {
        try {
            Container list = new Container();
            list.addElementToArray(3);
            list.addElementToArray(5);
            list.addElementToArray(8);
            list.removeElement(5);
            list.removeElement(8);
            String h = list.PopElement(3) + " ";
            assertEquals("3 ", h);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}