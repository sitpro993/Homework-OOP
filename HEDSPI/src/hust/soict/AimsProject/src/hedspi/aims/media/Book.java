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
        setTitle(title);
    }

    public Book(String title, String category){
        setTitle(title);
        setCategory(category);
    }

    public Book(String title, String category, float cost){
        setCategory(title);
        setTitle(title);
        setCost(cost);
    }

    public Book(int id, String title, String category, float cost){
        setCategory(title);
        setTitle(title);
        setCost(cost);
        setId(id);
    }


    public Book(int id, String title, String category, float cost, List<String> authors){
        setId(id);
        setCategory(title);
        setTitle(title);
        setCost(cost);
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
