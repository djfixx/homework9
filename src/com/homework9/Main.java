package com.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StandartHall standartHall = new StandartHall("��������", true, false);
        Hall3d hall3d = new Hall3d("3D", true, true, true);
        HallVip hallVip = new HallVip("VIP", true, true, true, true);

        Scanner input = new Scanner(System.in);

        System.out.println("������� ����� ���� �� 1 �� 3, ���: 1 - ��������, 2 - 3D, 3 - VIP");
        int a = input.nextInt();

        if (a < 1 || a > 3) System.out.println("�� ����� ������������ �����");
        else if (a == 1) {
            System.out.println("�� ������� ��� - ��������");
            standartHall.setShow();

        } else if (a == 2) {
            System.out.println("�� ������� ��� - 3D");
            hall3d.setShow();
        } else {
            System.out.println("�� ������� ��� - VIP");
            hallVip.setShow();
        }

    }
}
