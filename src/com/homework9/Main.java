package com.homework9;
public class Main {
    public static void main(String[] args) {
        StandartHall standartHall = new StandartHall("Стандарт", true, false);
        Hall3d hall3d = new Hall3d("3D", true, true, true);
        HallVip hallVip = new HallVip("VIP", true, true, true, true);

        Cinema ironMan = new Cinema("Железный человек", "Фантастика", 2008);

        ironMan.setShow(ironMan.setHall());
        ironMan.setFreeShow();
    }
}
