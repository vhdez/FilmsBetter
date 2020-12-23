package org.sla;

class BoxOfficeFilm extends Film {
    // Fields
    private int peak;

    // Constructors
    BoxOfficeFilm(int rank, String title, int releaseYear, long gross, int peak) {
        super(rank, title, releaseYear, gross);
        this.peak = peak;
    }

    // Setters/Getters

    int getPeak() {
        return peak;
    }

    void setPeak(int peak) {
        this.peak = peak;
    }

    // Methods
    public String toString() {
        String description = "\"" + this.getTitle();
        description = description + "\" has Box Office ranking #" + this.getRank();
        description = description + " from year " + this.getReleaseYear();
        description = description + " grossing $" + this.getGross();
        description = description + " and peaking at rank #" + this.getPeak();
        return description;
    }
}
