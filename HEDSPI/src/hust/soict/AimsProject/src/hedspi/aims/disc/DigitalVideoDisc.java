package hedspi.aims.disc;

import hedspi.aims.media.Media;

public class DigitalVideoDisc extends Disc implements Playable{


    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category){
        super(title,category);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title,category, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id,String title, String category, String director, float length ,float cost) {
        super(id, title, category, director, length, cost);
    }



    @Override
    public String showInfo() {
        return "DVD  . ID: " + getId() + " - Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}