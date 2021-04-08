package hedspi.aims.disc;

public class Track implements Playable{
    private final String title;
    private final float length;


    public String getTitle() {
        return title;
    }

    public float getLength() {
        return length;
    }


    public Track(String title, float length){
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
