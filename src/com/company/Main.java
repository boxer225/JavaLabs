package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Container array = new Container();

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n != 4) {
            System.out.println("    ");
            System.out.println("1. Добавить элемент в конец списка:  ");
            System.out.println("2. Удаление элемента по заданному значению:  ");
            System.out.println("3. Извлечение элемента по заданному значению:  ");
            System.out.println("4. Выход: ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не целочисленное значение");
                break;
            }

            switch (n) {
                case 1: {
                    System.out.print("Пожалуйста, введите элемент с целочисленным значением: ");
                    try {
                        int j = scanner.nextInt();
                        System.out.println(j);

                        array.addElementToArray(j);
                        System.out.print(array.toString() + " ");
                    } catch (InputMismatchException e) {
                        System.out.println("ОШИБКА!!!");
                    }
                }
                ;
                break;
                case 2: {
                    System.out.print("Пожалуйста, введите значение элемента, которое необходимо удалить: ");
                    if (scanner.hasNextInt()) {
                        int j = scanner.nextInt();
                        System.out.println(j);
                        try {
                            array.removeElement(j);
                        } catch (Exception e) {
                            System.out.print("ОШИБКА!!!!");
                        }
                        System.out.print(array.toString() + " ");
                    } else {
                        System.out.println("Вы ввели не целочисленное значение");
                    }
                }
                ;
                break;
                case 3: {
                    System.out.print("Пожалуйста, введите элемент, по которому будет происходить извлечение элемнта: ");
                    if (scanner.hasNextInt()) {
                        int j = scanner.nextInt();
                        System.out.println(j);

                        System.out.println("Ваш элемент:   ");
                        try {
                            System.out.print(array.PopElement(j));
                        } catch (Exception e) {
                            System.out.print("ОШИБКА!!!!!!");
                        }

                    } else {
                        System.out.println("Вы ввели не целочисленное значение");
                    }
                }
                ;
                break;
                case 4: break;
                default:
                    System.out.println("Вы ввели некорректный номер ");
                    break;

            }
        }

    }
}
