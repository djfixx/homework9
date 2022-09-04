package com.homework9;

public class Hall3d extends CinemaHall {
    protected boolean supportImax;
    protected boolean support4dx;
    Hall3d(String hallName, boolean surroundSound, boolean supportImax, boolean support4dx){
        this.hallName = hallName;
        this.surroundSound = surroundSound;
        this.supportImax = supportImax;
        this.support4dx = support4dx;
    }


}
