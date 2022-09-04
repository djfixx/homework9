package com.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaHall {
    protected String hallName;
    protected boolean surroundSound;
    protected boolean[][] seats1000 = new boolean[4][5];
    protected boolean[][] seats1330 = new boolean[4][5];
    protected boolean[][] seats1800 = new boolean[4][5];

    public boolean[][] getSeats1000() {
        return seats1000;
    }

    public boolean[][] getSeats1330() {
        return seats1330;
    }

    public boolean[][] getSeats1800() {
        return seats1800;
    }


    Scanner input = new Scanner(System.in);

    public void setShow() {

        System.out.println("Введите номер сеанса от 1 до 3,  где: 1-й - 10:00, 2-й - 13:30, 3-й - 18:00");
        int a = input.nextInt();

        if (a < 1 || a > 3) System.out.println("Вы ввели неправильное число");
        else if (a == 1) {
            System.out.println("Вы выбрали сеанс в 10:00");
            System.out.println("Введите номер желаемого ряда от 0 до 3: ");
            int row = input.nextInt();
            System.out.println("Введите номер желаемого места от 0 до 4: ");
            int seat = input.nextInt();
            if (seats1000[row][seat] == false) {
                System.out.println("Место свободно. Забронировать? Введите 1, если да, 0 если нет");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("Вы ввели неправильное число");
                else if (b == 1) {
                    seats1000[row][seat] = true;
                    System.out.println("Место забронировано");
                }
            } else System.out.println("Место занято. Выберите другое место");


        } else if (a == 2) {
            System.out.println("Вы выбрали сеанс в 13:30");
            System.out.println("Введите номер желаемого ряда от 0 до 3: ");
            int row = input.nextInt();
            System.out.println("Введите номер желаемого места от 0 до 4: ");
            int seat = input.nextInt();
            if (seats1330[row][seat] == false) {
                System.out.println("Место свободно. Забронировать? Введите 1, если да, 0 если нет");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("Вы ввели неправильное число");
                else if (b == 1) {
                    seats1330[row][seat] = true;
                    System.out.println("Место забронировано");
                }
            } else System.out.println("Место занято. Выберите другое место");


        } else {
            System.out.println("Вы выбрали сеанс в 18:00");
            System.out.println("Введите номер желаемого ряда от 0 до 3: ");
            int row = input.nextInt();
            System.out.println("Введите номер желаемого места от 0 до 4: ");
            int seat = input.nextInt();
            if (seats1800[row][seat] == false) {
                System.out.println("Место свободно. Забронировать? Введите 1, если да, 0 если нет");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("Вы ввели неправильное число");
                else if (b == 1) {
                    seats1800[row][seat] = true;
                    System.out.println("Место забронировано");
                }
            } else System.out.println("Место занято. Выберите другое место");

        }
    }
}









