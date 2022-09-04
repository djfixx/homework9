package com.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StandartHall standartHall = new StandartHall("Стандарт", true, false);
        Hall3d hall3d = new Hall3d("3D", true, true, true);
        HallVip hallVip = new HallVip("VIP", true, true, true, true);

        Scanner input = new Scanner(System.in);

        System.out.println("Введите номер зала от 1 до 3, где: 1 - Стандарт, 2 - 3D, 3 - VIP");
        int a = input.nextInt();

        if (a < 1 || a > 3) System.out.println("Вы ввели неправильное число");
        else if (a == 1) {
            System.out.println("Вы выбрали зал - Стандарт");
            standartHall.setShow();

        } else if (a == 2) {
            System.out.println("вы выбрали зал - 3D");
            hall3d.setShow();
        } else {
            System.out.println("Вы выбрали зал - VIP");
            hallVip.setShow();
        }

    }
}
