package com.diegobarros.springmovies;

public class Movies {
    private int id;
    private String title;
    private int release_year;
    private String director;
    private String genre;
    private String synopsis;

    public Movies(int id, String title, int release_year, String director, String genre, String synopsis) {
        this.id = id;
        this.title = title;
        this.release_year = release_year;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return title;
    }

    public int getRelease_year() {
        return release_year;
    }
    public String getDirector() {
        return director;

    }
    public String getGenre() {
        return genre;
    }
    public String getSynopsis() {
        return synopsis;
    }
}
