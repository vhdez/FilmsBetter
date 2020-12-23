package org.sla;

import java.util.ArrayList;

class Film {
    // Fields
    private static ArrayList<Film> films;
    private int rank;
    private String title;
    private int releaseYear;
    private long gross;

    // Constructors
    Film(int rank, String title, int releaseYear, long gross) {
        this.rank = rank;
        this.title = title;
        this.releaseYear = releaseYear;
        this.gross = gross;

        // store the new object in the films ArrayList
        if (films == null) {
            films = new ArrayList<Film>();
        }
        films.add(this);
    }

    // Setters/Getters

    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getReleaseYear() {
        return releaseYear;
    }

    void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    long getGross() {
        return gross;
    }

    void setGross(long gross) {
        this.gross = gross;
    }

    // Methods
    public String toString() {
        String description = "\"" + this.getTitle();
        description = description + "\" has Film ranking #" + this.getRank();
        description = description + " from year " + this.getReleaseYear();
        description = description + " grossing $" + this.getGross();
        return description;
    }

    static void describeAll() {
        films.forEach(film -> {
            System.out.println(film.toString());
        });
    }
}
