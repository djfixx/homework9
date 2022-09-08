package com.homework9;

import java.util.Scanner;

public class CinemaHall {
    protected String hallName;
    protected boolean surroundSound;


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
        Seats seat = new Seats();

        System.out.println("Введите номер сеанса от 1 до 3,  где: 1-й - 10:00, 2-й - 13:30, 3-й - 18:00");
        int a = input.nextInt();
        if (a == 1) System.out.println("Вы выбрали сеанс в 10:00");
        else if (a == 2) System.out.println("Вы выбрали сеанс в 13:30");
        else System.out.println("Вы выбрали сеанс в 18:00");

        if (a < 1 || a > 3) System.out.println("Вы ввели неправильное число");
        else if (a == 1 && b == 1) setSeat(seat.getSeats10st());
        else if (a == 1 && b == 2) setSeat(seat.getSeats103d());
        else if (a == 1 && b == 3) setSeat(seat.getSeats10vip());

        else if (a == 2 && b == 1) setSeat(seat.getSeats13st());
        else if (a == 2 && b == 2) setSeat(seat.getSeats133d());
        else if (a == 2 && b == 3) setSeat(seat.getSeats13vip());

        else if (a == 3 && b == 1) setSeat(seat.getSeats18st());
        else if (a == 3 && b == 2) setSeat(seat.getSeats183d());
        else if (a == 3 && b == 3) setSeat(seat.getSeats18vip());

    }

    public void setFreeShow() {
        Seats seat = new Seats();
        System.out.println("Подобрать билет на ближайший сеанс? Если да - введите 1, нет - 0");
        int a = input.nextInt();
        if (a < 0 || a > 1) System.out.println("Вы ввели неправильное число");

        for (int i = 1; i < 2; i++) {
            finder(seat.getSeats10st());
            if (finder(seat.getSeats10st())) break;
            finder(seat.getSeats103d());
            if (finder(seat.getSeats103d())) break;
            finder(seat.getSeats10vip());
            if (finder(seat.getSeats10vip())) break;
            finder(seat.getSeats13st());
            if (finder(seat.getSeats13st())) break;
            finder(seat.getSeats133d());
            if (finder(seat.getSeats133d())) break;
            finder(seat.getSeats13vip());
            if (finder(seat.getSeats13vip())) break;
            finder(seat.getSeats18st());
            if (finder(seat.getSeats18st())) break;
            finder(seat.getSeats18st());
            if (finder(seat.getSeats183d())) break;
            finder(seat.getSeats18vip());
            if (finder(seat.getSeats18vip())) break;
        }
    }

    public boolean finder(boolean[][] arr) {
        boolean f = false;
        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j]) {
                    arr[i][j] = true;
                    f = true;
                    break;
                }
                System.out.println("Забронировано место на сеанс в 10:00, место " + i + " ряд " + j);
            }
            break;

        }
        return f;
    }
}






