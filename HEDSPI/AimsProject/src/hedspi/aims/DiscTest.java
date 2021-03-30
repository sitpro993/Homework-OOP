package hedspi.aims;

import hedspi.aims.disc.DigitalVideoDisc;
import hedspi.aims.order.Order;

import java.util.Scanner;

public class DiscTest {
    public static void main(String[] args) {
        Order order = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 11, 22.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 22, 36.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action Movie", "Christopher Nolan", 33, 33.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Terminator 2: Judgment Day", "Action Movie", "James Cameron", 44, 50.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Die Hard", "Action Movie", "John McTiernan", 55, 222.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Inception", "Action Movie", "Christopher Nolan", 66, 33.95f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Doraemon", "Action Movie", "Christopher Nolan", 80, 38.95f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("One Piece", "Action Movie", "Christopher Nolan", 100, 15.65f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Harry Potter", "Action Movie", "Christopher Nolan", 76, 36.95f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Dragon", "Action Movie", "Christopher Nolan", 132, 32.95f);

        DigitalVideoDisc[] disc = {dvd4, dvd5, dvd6,dvd7,dvd8,dvd9,dvd10};
        order.addDigitalVideoDisc(dvd1);
        order.addDigitalVideoDisc(dvd2, dvd3);
        order.addDigitalVideoDisc(disc);

        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int select;
        do {
            System.out.println("1. Show list of orders.");
            System.out.println("2. Search for the title.");
            System.out.println("3. Lucky draw.");
            System.out.println("4. Calculate the total amount.");
            System.out.println("5. Exit.");
            System.out.print("Your choose: ");
            select=sc.nextInt();
            switch(select) {
                case 1:
                    order.show();
                    break;
                case 2:
                    DigitalVideoDisc d1 = new DigitalVideoDisc("HARRY love  Potter", "Animation", "Roger Allers", 11, 77.95f);
                    System.out.println(d1.search("Harry Potter"));
                    DigitalVideoDisc d2 = new DigitalVideoDisc("HARRY Potter", "Animation", "Roger Allers", 11, 77.95f);
                    System.out.println(d2.search("Harry Potter"));
                    DigitalVideoDisc d3 = new DigitalVideoDisc("HARRY sjydkhao", "Animation", "Roger Allers", 11, 77.95f);
                    System.out.println(d3.search("Harry Potter"));
                    break;
                case 3:
                    DigitalVideoDisc itemsOrdered[] = order.getDvdList();
                    System.out.println("Lucky number is:");
                    order.random();
                    System.out.println(order.getALuckyItem().getTitle() + " - " + order.getALuckyItem().getCategory() + " - " + order.getALuckyItem().getDirector() + " - " + order.getALuckyItem().getLength() + " - " + order.getALuckyItem().getCost());
                    break;
                case 4:
                    order.list_order();
                    System.out.println("Sum: " + order.totalCost());
                    break;
                case 5:
                    System.out.println("Goodbye! Have good day");
                    check = false;
                    break;
                default:
                    System.out.println("Incorrect, please try again");
                    break;
            }
        } while(check);
    }
}
