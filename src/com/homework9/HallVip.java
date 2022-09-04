package com.homework9;

public class HallVip extends CinemaHall {
    protected boolean supportImax;
    protected boolean support4dx;
    protected boolean hasBar;
    HallVip(String hallName, boolean surroundSound, boolean supportImax, boolean support4dx, boolean hasBar) {
        this.hallName = hallName;
        this.surroundSound = surroundSound;
        this.supportImax = supportImax;
        this.support4dx = support4dx;
        this.hasBar = hasBar;
    }

}
