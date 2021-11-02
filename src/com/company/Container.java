package com.company;

import java.util.EmptyStackException;
/**
 * Это класс Container, который служит для хранения объектов
 *
 * @author Andrey Sarychev
 * head - начало односвязного списка
 * size - количество элементов в списке
 */

public class Container {
    /** head - указатель на начало списка */
    List head;
    /** size - количество элементов в списке */
    int size;

    /**
     * Это конструктор, который инициализирует свой список
     */
    public Container() {
        head = null;
        size = 0;
    }
    /** проверяет, присутствует ли первый элемент в списке
     * @return - возвращает true, если список пуст, и false, если есть хотя бы один элемент */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Этот метод добавляет элемент в конец односвязного списка
     * @param a это элемент, который надо добавить в список
     */
    public void addElementToArray(int a) {
        if (isEmpty()) {
            List p = new List (a, null);
            this.head = p;
            this.size = 1;
        }
        else {
            List p = this.head;
            for (;p.next != null;) {
                p = p.next;

            }
            List s = p;
            s.next = new List(a, p);
            s.next.next = null;
            size++;

        }
    }



    /**
     * Этот метод, который удаляет элемент по заданному ключу
     * @param a это элемент, по которому ищется значения, которое необходимо удалить
     */
    public void removeElement(int a) {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        else {
            List p = head;
            List s = head;
            for (; p.next != null; ) {
                if (p.data == a) {
                    s.next = p.next;
                    p.next = null;
                    size--;
                } else {
                    s = p;
                    p = p.next;
                }
            }
        }
    }


    /**
     * Этот метод, который извлекает элемент односвязного списка по ключу
     *
     * @param a это значение, по которому ищется извлекаемый элемент
     * @return возвращает a, если нужный элемент нашёлся, и 0, если нет
     */
    public int PopElement(int a) {
        List p = head;
        int flag = 1;
        int pop = -100;
        for (;p != null;) {
            if (p.data == a) {
                flag = 0;
                pop = p.data;
            }
            p = p.next;
        }
        if (flag == 0) {
            return pop;
        }
        else if (flag == 1) throw new IllegalArgumentException();
        return 0;
    }


    /**
     * Это метод, который создаёт из элементов односвязного списка строку и выводит её.
     *
     * @return строка, которая содержит все элементы односвязного списка
     */
    @Override public String toString() {
        String list = new String("");
        List p = head;
        if (isEmpty()) {
            return list;
        }
        for (int i = 0; i < size && p != null; i++) {
            String tmp = Integer.toString(p.data);
            list += tmp.toString() + " ";
            p = p.next;
        }
        list = list.substring(0, list.length()-1);
        return list;

    }
}