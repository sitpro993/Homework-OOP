package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 3;
    public static final int MAX_LIMITTED_ORDERS = 2;
    private static int nbOrder=0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int dem=0;
    private int stt=0;
    boolean cont=true;
    Scanner sc = new Scanner(System.in);

    public Order(){
        nbOrder++;
    }

    public void qtyOrdered(){
        if(dem<MAX_NUMBERS_ORDERED-1) System.out.println("Added to order");
        if(dem==MAX_NUMBERS_ORDERED-1) System.out.println("Added to order, order about to fill");
        if(dem==MAX_NUMBERS_ORDERED) System.out.println("Added to order, order is full");
        if(dem>MAX_NUMBERS_ORDERED) System.out.println("Full, can not add");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        dem++;
        System.out.println(dem + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() + " - " + disc.getDirector() + " - " + disc.getLength() + " - " + disc.getCost());
        qtyOrdered();
        if(dem<=10) {
            itemsOrdered[dem-1]=disc;
        }else {
            System.out.println("Deleted");
            dem--;
        }
    }

    public void addDigitalVideoDiscmang(DigitalVideoDisc[] disc){
        if(nbOrder<=MAX_LIMITTED_ORDERS){
            itemsOrdered = disc;
            while(cont){
                dem++;
                stt++;
                System.out.println(stt + ". DVD - " + disc[dem-1].getTitle() + " - " + disc[dem-1].getCategory() + " - " + disc[dem-1].getDirector() + " - " + disc[dem-1].getLength() + " - " + disc[dem-1].getCost());
                qtyOrdered();
                if(dem>MAX_NUMBERS_ORDERED){
                    int choose;
                    int DVD;
                    boolean a=true;
                    System.out.println("Do you want to delete 1 selected DVD to replace this DVD ");
                    System.out.println("1.Yes\n2.No");
                    do{
                        System.out.print("Your choose: "); choose=sc.nextInt();
                        switch(choose){
                            case 1:
                                System.out.print("Import the DVD you want to erase: "); DVD=sc.nextInt();
                                removeDigitalVideoDisc(disc[DVD-1]);
                                System.out.println("DVD" + DVD + " has been removed from the list");
                                System.out.println("DVD"+ stt + "has been added to the list");
                                a = false;
                                break;
                            case 2:
                                System.out.println("DVD" + stt +"has been removed from the list");
                                a = false;
                                break;
                            default:
                                System.out.println("You choose wrong, please try again");
                                break;
                        }
                    }while(a);
                }
                if(stt == disc.length) cont=false;
            }
        }else System.out.println("It is too limit");
    }

    public float totalCost(DigitalVideoDisc[] disc){
        float sum=0;
        if(dem>MAX_NUMBERS_ORDERED){
            for(int i=0;i<MAX_NUMBERS_ORDERED ;i++){
                sum +=disc[i].getCost();
            }
        } else{
            for(int i=0;i<dem ;i++){
                sum +=disc[i].getCost();
            }
        }
        return sum;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<=dem - 1;i++){
            if(itemsOrdered[i]==disc){
                itemsOrdered[i]=itemsOrdered[i+1];
            }
        }
    }
}
