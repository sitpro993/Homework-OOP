package hedspi.aims.disc;

import hedspi.aims.media.Media;

public abstract class Disc extends Media {
    protected float length;
    protected String director;

    public float getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(String title){
        super(title);
    }

    public Disc(String title, String category){
        super(title,category);
    }

    public Disc(String title, String category, float cost){
        super(title,category, cost);
    }

    public Disc(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public Disc(int id, String title, String category, String director, float cost){
        super(id, title, category, cost);
        this.director = director;
    }

    public Disc(int id, String title, String category, String director, float length, float cost){
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public abstract String showInfo();

}
