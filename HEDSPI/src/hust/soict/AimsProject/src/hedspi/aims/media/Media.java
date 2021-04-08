package hedspi.aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;
    protected int id;



    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }


    public boolean search(String title){
        int count = 0;
        String[] s1 = getTitle().split("\\s");
        String[] s2 = title.split("\\s");
        for (String s3 : s2){
            for (String s4 : s1){
                if(s4.equalsIgnoreCase(s3)){
                    count++;
                }
            }
        }
        return count == s2.length;
    }


    public Media() {

    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title,String category){
        this.title = title;
        this.category = category;
    }

    public Media(String title,String category,float cost){
        this.title = title;
        this.category = category;
        this.cost=cost;
    }

    public Media(int id,String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }

    public abstract String showInfo();
}
