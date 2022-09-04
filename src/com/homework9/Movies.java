package com.homework9;

public class Movies {
    protected String movieName;
    protected String movieGenre;
    protected String dateOfShow;
    protected String timeOfShow;
    Movies(String movieName, String movieGenre, String dateOfShow, String timeOfShow){
        this.movieName = movieName;
        this.movieGenre =movieGenre;
        this.dateOfShow = dateOfShow;
        this.timeOfShow = timeOfShow;
    }
}