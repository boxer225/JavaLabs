package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void TestAddElementToArray() {
        try {
            Container array = new Container();
            array.addElementToArray(3);
            array.addElementToArray(5);
            array.addElementToArray(6);
            assertEquals("3 5 6", array.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @org.junit.jupiter.api.Test
    void TestRemoveElement() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(8);
            intArray2.removeElement(5);
            assertEquals("3 8", intArray2.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void TestPopElement() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(8);
            intArray2.removeElement(5);
            intArray2.removeElement(8);
            String h = intArray2.PopElement(3) + " ";
            assertEquals("3 ", h);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}