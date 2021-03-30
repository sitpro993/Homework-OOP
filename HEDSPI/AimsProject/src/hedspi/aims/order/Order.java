package hedspi.aims.order;

import hedspi.aims.disc.DigitalVideoDisc;

import java.util.*;

public class Order {

    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERED = 5;
    public static Order or[] = new Order[MAX_LIMITED_ORDERED];
    public static int nbOrder = 0;
    int dem = 0;
    int rand = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public Order(){
        nbOrder++;
    }

    public DigitalVideoDisc[] getDvdList() {
        return itemsOrdered;
    }


    public void qtyOrdered() {
        dem++;
        if (dem < MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The disc is added successfully");
        }
        if (dem == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The disc is added successfully, the number is about to be full");
        }
        if (dem == MAX_NUMBERS_ORDERED ) {
            System.out.println("The disc is added successfully, quantity is full");
        }
        if (dem > MAX_NUMBERS_ORDERED ) {
            System.out.println("quantity is full, cannot add");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(nbOrder<=MAX_LIMITED_ORDERED){
            if (dem < MAX_NUMBERS_ORDERED) {
                itemsOrdered[dem] = disc;
                qtyOrdered();
            }else {
                qtyOrdered();
                dem--;
            }
        } else{ System.out.println("Too limited");}
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if(nbOrder<=MAX_LIMITED_ORDERED){
            if (dem < MAX_NUMBERS_ORDERED) {
                itemsOrdered[dem] = disc1;
                qtyOrdered();
            }else {
                qtyOrdered();
                dem--;
            }
            if (dem < MAX_NUMBERS_ORDERED) {
                itemsOrdered[dem] = disc2;
                qtyOrdered();
            } else {
                qtyOrdered();
                dem--;
            }
        } else{ System.out.println("Too limited");}
    }

    // Thêm mảng dvd vào order
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if(nbOrder<=MAX_LIMITED_ORDERED){
            for (int i = 0; i < dvdList.length; i++) {
                if(dem < MAX_NUMBERS_ORDERED){
                    itemsOrdered[dem] = dvdList[i];
                    qtyOrdered();
                }else {
                    qtyOrdered();
                    dem--;
                }
            }
        } else{ System.out.println("Too limited");}
    }

    public void show(){
        for(int i = 0; i < dem; i++) {
            System.out.println("Id: " + (i + 1));
            System.out.println("Title: " + itemsOrdered[i].getTitle());
            System.out.println("Category: " + itemsOrdered[i].getCategory());
            System.out.println("Director: " + itemsOrdered[i].getDirector());
            System.out.println("Length: " + itemsOrdered[i].getLength());
            System.out.println("Cost: " + itemsOrdered[i].getCost());
            System.out.println("------------------------------------");
        }
    }

    public void list_order(){
        for(int i = 0; i < dem; i++) {
            if(i == rand) {
                System.out.println("Id: " + (i + 1));
                System.out.println("Title: " + itemsOrdered[i].getTitle());
                System.out.println("Category: " + itemsOrdered[i].getCategory());
                System.out.println("Director: " + itemsOrdered[i].getDirector());
                System.out.println("Length: " + itemsOrdered[i].getLength());
                System.out.println("Cost: 0" );
                System.out.println("------------------------------------");
            }
            else {
                System.out.println("Id: " + (i + 1));
                System.out.println("Title: " + itemsOrdered[i].getTitle());
                System.out.println("Category: " + itemsOrdered[i].getCategory());
                System.out.println("Director: " + itemsOrdered[i].getDirector());
                System.out.println("Length: " + itemsOrdered[i].getLength());
                System.out.println("Cost: " + itemsOrdered[i].getCost());
                System.out.println("------------------------------------");
            }
        }
    }


    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < dem; i++) {
            sum += itemsOrdered[i].getCost();
        }
        if(rand != 10){
            sum -= getALuckyItem().getCost();
        }
        return sum;
    }



    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i=0;i<dem;i++){
            if (itemsOrdered[i] == disc){
                for (int j = i; j < dem-1; j++) {
                    itemsOrdered[j]=itemsOrdered[j + 1];
                }
                dem--;
                System.out.println("Đã xóa phần tử khỏi danh sách");
            }
        }
    }

    public DigitalVideoDisc getALuckyItem(){
        return itemsOrdered[rand];
    }

    public int random(){
        int range = 10;
        rand = (int)(Math.random() * range) ;
        return rand;
    }
}