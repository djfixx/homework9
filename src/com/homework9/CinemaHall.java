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

        System.out.println("������� ����� ������ �� 1 �� 3,  ���: 1-� - 10:00, 2-� - 13:30, 3-� - 18:00");
        int a = input.nextInt();

        if (a < 1 || a > 3) System.out.println("�� ����� ������������ �����");
        else if (a == 1) {
            System.out.println("�� ������� ����� � 10:00");
            System.out.println("������� ����� ��������� ���� �� 0 �� 3: ");
            int row = input.nextInt();
            System.out.println("������� ����� ��������� ����� �� 0 �� 4: ");
            int seat = input.nextInt();
            if (seats1000[row][seat] == false) {
                System.out.println("����� ��������. �������������? ������� 1, ���� ��, 0 ���� ���");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("�� ����� ������������ �����");
                else if (b == 1) {
                    seats1000[row][seat] = true;
                    System.out.println("����� �������������");
                }
            } else System.out.println("����� ������. �������� ������ �����");


        } else if (a == 2) {
            System.out.println("�� ������� ����� � 13:30");
            System.out.println("������� ����� ��������� ���� �� 0 �� 3: ");
            int row = input.nextInt();
            System.out.println("������� ����� ��������� ����� �� 0 �� 4: ");
            int seat = input.nextInt();
            if (seats1330[row][seat] == false) {
                System.out.println("����� ��������. �������������? ������� 1, ���� ��, 0 ���� ���");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("�� ����� ������������ �����");
                else if (b == 1) {
                    seats1330[row][seat] = true;
                    System.out.println("����� �������������");
                }
            } else System.out.println("����� ������. �������� ������ �����");


        } else {
            System.out.println("�� ������� ����� � 18:00");
            System.out.println("������� ����� ��������� ���� �� 0 �� 3: ");
            int row = input.nextInt();
            System.out.println("������� ����� ��������� ����� �� 0 �� 4: ");
            int seat = input.nextInt();
            if (seats1800[row][seat] == false) {
                System.out.println("����� ��������. �������������? ������� 1, ���� ��, 0 ���� ���");
                int b = input.nextInt();
                if (b < 0 || b > 1) System.out.println("�� ����� ������������ �����");
                else if (b == 1) {
                    seats1800[row][seat] = true;
                    System.out.println("����� �������������");
                }
            } else System.out.println("����� ������. �������� ������ �����");

        }
    }
}









