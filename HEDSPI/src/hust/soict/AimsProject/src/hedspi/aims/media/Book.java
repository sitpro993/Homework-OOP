package hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String title){
        super(title);
    }

    public Book(String title, String category){
        super(title, category);
    }

    public Book(String title, String category, float cost){
        super(title, category, cost);
    }

    public Book(int id, String title, String category, float cost){
        super(id,title, category, cost);
    }


    public Book(int id, String title, String category, float cost, List<String> authors){
        super(id, title, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String author_Name){
        if (!authors.contains(author_Name)){
            authors.add(author_Name);
        }
        else System.out.println("Already exist.");
    }

    public void removeAuthor(String author_Name){
        if (authors.contains(author_Name)){
            authors.remove(author_Name);
        } else System.out.println("Does not exist.");
    }

    @Override
    public String showInfo() {
        return "Book . ID: " + getId() +  " - Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Authors: " + getAuthors();
    }
}
