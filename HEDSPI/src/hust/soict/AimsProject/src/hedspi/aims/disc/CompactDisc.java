package hedspi.aims.disc;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable{

    protected String artist;
    protected final ArrayList<Track> track = new ArrayList<>();


    public String getArtist() {
        return artist;
    }


    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category){
        super(title,category);
    }

    public CompactDisc(String title, String category, float cost){
        super(title,category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public CompactDisc(int id,String title, String category, String director,float cost, String artist) {
        super(id, title, category, director, cost);
        this.artist = artist;
    }

    public void addTrack(Track item){
        track.add(item);
    }

    public void addTrack(Track item1, Track item2){
        addTrack(item1);
        addTrack(item2);
    }

    public void addTrack(ArrayList<Track> items){
        for(Track item : items){
            addTrack(item);
        }
    }

    public void removeTrack(Track item){
        if(track.contains(item)){
            track.remove(item);
            System.out.println("removed from the CD");
        }else System.out.println("Does not exist");

    }



    public float getLength(){
        float length = 0;
        for (Track value : track) {
            length += value.getLength();
        }
        return length;
    }

    @Override
    public String showInfo() {
        return "CD  . ID: " + getId() + " - Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }

    @Override
    public void play() {
            System.out.println("Playing CD: " + getTitle());
            System.out.println("CD length: " + getLength());
    }
}
