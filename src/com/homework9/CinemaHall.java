package com.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaHall {
    protected String hallName;
    protected boolean surroundSound;
    protected boolean[][] seats10st = new boolean[4][5];
    protected boolean[][] seats13st = seats10st.clone();
    protected boolean[][] seats18st = seats10st.clone();
    protected boolean[][] seats103d = seats10st.clone();
    protected boolean[][] seats133d = seats10st.clone();
    protected boolean[][] seats183d = seats10st.clone();
    protected boolean[][] seats10vip = seats10st.clone();
    protected boolean[][] seats13vip = seats10st.clone();
    protected boolean[][] seats18vip = seats10st.clone();


    Scanner input = new Scanner(System.in);

    public boolean[][] setSeat(boolean[][] seats) {

        System.out.println("Введите номер желаемого ряда от 0 до 3: ");
        int row = input.nextInt();
        System.out.println("Введите номер желаемого места от 0 до 4: ");
        int seat = input.nextInt();
        if (!seats[row][seat]) {
            System.out.println("Место свободно. Забронировать? Введите 1, если да, 0 если нет");
            int b = input.nextInt();
            if (b < 0 || b > 1) System.out.println("Вы ввели неправильное число");
            else if (b == 1) {
                seats[row][seat] = true;
                System.out.println("Место забронировано");
            }
        } else System.out.println("Место занято. Выберите другое место");
        return seats;
    }
    public int setHall() {

        System.out.println("Введите номер зала от 1 до 3, где: 1 - Стандарт, 2 - 3D, 3 - VIP");
        int a = input.nextInt();
        if (a < 1 || a > 3) System.out.println("Вы ввели неправильное число");
        else if (a == 1) {
            System.out.println("Вы выбрали зал - Стандарт");


        } else if (a == 2) {
            System.out.println("Вы выбрали зал - 3D");

        } else {
            System.out.println("Вы выбрали зал - VIP");
        }
        return a;
    }

    public void setShow(int b) {

        System.out.println("Введите номер сеанса от 1 до 3,  где: 1-й - 10:00, 2-й - 13:30, 3-й - 18:00");
        int a = input.nextInt();
        if(a == 1) System.out.println("Вы выбрали сеанс в 10:00");
        else if (a == 2) System.out.println("Вы выбрали сеанс в 13:30");
        else System.out.println("Вы выбрали сеанс в 18:00");

        if (a < 1 || a > 3) System.out.println("Вы ввели неправильное число");
        else if (a == 1 && b == 1) setSeat(seats10st);
        else if (a == 1 && b == 2) setSeat(seats103d);
        else if (a == 1 && b == 3) setSeat(seats10vip);

        else if (a == 2 && b == 1) setSeat(seats13st);
        else if (a == 2 && b == 2) setSeat(seats133d);
        else if (a == 2 && b == 3) setSeat(seats13vip);

        else if (a == 3 && b == 1) setSeat(seats18st);
        else if (a == 3 && b == 2) setSeat(seats183d);
        else if (a == 3 && b == 3) setSeat(seats18vip);

    }

    public void setFreeShow() {
        System.out.println("Подобрать билет на ближайший сеанс? Если да - введите 1, нет - 0");
        int a = input.nextInt();
        if (a < 0 || a > 1) System.out.println("Вы ввели неправильное число");
        if (a == 1) finder(seats10st);


    }


    public void finder(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == false) {
                    arr[i][j] = true;
                    System.out.println("Забронировано место на сеанс в 10:00, ряд " + i + " место " + j);
                    break;

                }
            }
        }
    }
}





