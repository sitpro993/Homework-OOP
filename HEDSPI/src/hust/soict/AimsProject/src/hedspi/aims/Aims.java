package hedspi.aims;

import hedspi.aims.disc.CompactDisc;
import hedspi.aims.disc.DigitalVideoDisc;
import hedspi.aims.disc.Track;
import hedspi.aims.media.Book;
import hedspi.aims.media.Media;
import hedspi.aims.order.Order;
import hedspi.aims.utils.Mydate;

import java.util.*;

public class Aims {

    public static Order createOrder() {
        if (Order.checkNumberOfOrder()) {
            System.out.println("Order has been created");
            return new Order();
        } else {
            System.out.println("Cannot create more order...");
            return null;
        }
    }
    public static void main(String[] args) {


        ArrayList <Media> items = new ArrayList<>();
        ArrayList <Track> tracks = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int select;
        do{
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("0. Exit");
            System.out.print("You choose: ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    showAdminMenu(items,tracks);
                    break;
                case 2:
                    showUserMenu(items);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    check = false;
                    break;

                default:
                    System.out.println("Enter incorrectly, re-enter");
                    break;

            }

        }while (check);



    }

    public static boolean check(ArrayList<Media> items,int id){
        for (Media item : items) {
            if (item.getId() == id) return false;
        }
        return true;
    }

    public static boolean check(ArrayList<Media> items,String title){
        for (Media item : items) {
            if (item.getTitle().equals(title)) return false;
        }
        return true;
    }

    public static void showAdminMenu(ArrayList<Media> items, ArrayList<Track> tracks) {


        String title;
        String category;
        float cost;
        int id;
        float length;


        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int select;

        do {
            System.out.println("|--------------------------------|");
            System.out.println("|Product Management Application: |");
            System.out.println("|--------------------------------|");
            System.out.println("|1. Create new item.             |");
            System.out.println("|2. Delete item by id.           |");
            System.out.println("|3. Display the items list       |");
            System.out.println("|0. Exit                         |");
            System.out.println("|--------------------------------|");
            System.out.println("Please choose a number: 0-1-2-3");
            System.out.print("You choose: ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    boolean checked = true;
                    int choose;
                    do{
                        System.out.println("--------------------------------");
                        System.out.println("|Create new items:              |");
                        System.out.println("|-------------------------------|");
                        System.out.println("|1. Create new DVD              |");
                        System.out.println("|2. Create new CD               |");
                        System.out.println("|3. Create new Book             |");
                        System.out.println("|0. Exit                        |");
                        System.out.println("|-------------------------------|");
                        System.out.println("Please choose a number: 0-1-2-3");
                        System.out.print("You choose: ");
                        choose = sc.nextInt();
                        sc.nextLine();
                        switch (choose){
                            case 1:
                                while (true){
                                    System.out.print("ID: ");
                                    id = sc.nextInt();
                                    sc.nextLine();
                                    if (check(items, id)) break;
                                    else System.out.println("ID already exist");
                                }
                                while (true){
                                    System.out.print("Title: ");
                                    title = sc.nextLine();
                                    if (check(items, title)) break;
                                    else System.out.println("Title already exist");
                                }
                                System.out.print("Category: ");
                                category = sc.nextLine();

                                System.out.print("Director: ");
                                String director = sc.nextLine();

                                System.out.print("Length: ");
                                length = sc.nextFloat();
                                sc.nextLine();

                                System.out.print("Cost: ");
                                cost = sc.nextFloat();
                                sc.nextLine();

                                DigitalVideoDisc dvd = new DigitalVideoDisc(id,title,category,director,length,cost);
                                items.add(dvd);
                                System.out.println("Do you want to play?\n1.Yes  2.No");
                                System.out.print("You choose: ");
                                int chond1 = sc.nextInt();
                                sc.nextLine();
                                boolean checkd1 = true;
                                do{
                                    switch(chond1){
                                        case 1:
                                            dvd.play();
                                            checkd1 = false;
                                            break;
                                        case 2:
                                            checkd1 = false;
                                            break;
                                        default:
                                            System.out.println("Enter incorrectly, re-enter");
                                            break;
                                    }
                                }while(checkd1);
                                break;
                            case 2:
                                while (true){
                                    System.out.print("ID: ");
                                    id = sc.nextInt();
                                    sc.nextLine();
                                    if (check(items, id)) break;
                                    else System.out.println("ID already exist");
                                }

                                while (true){
                                    System.out.print("Title: ");
                                    title = sc.nextLine();
                                    if (check(items, title)) break;
                                    else System.out.println("Title already exist");
                                }

                                System.out.print("Category: ");
                                category = sc.nextLine();

                                System.out.print("Director: ");
                                director = sc.nextLine();

                                System.out.print("Cost: ");
                                cost = sc.nextFloat();
                                sc.nextLine();

                                System.out.print("Artist: ");
                                String artist = sc.nextLine();

                                System.out.print("Enter the number of tracks: "); int number = sc.nextInt();
                                sc.nextLine();
                                for(int i = 0; i < number ; i++){
                                    System.out.print("Enter title of track: "); String titleTrack = sc.nextLine();
                                    System.out.print("Enter length of track: "); int lengthTrack = sc.nextInt();
                                    sc.nextLine();
                                    Track track = new Track(titleTrack,lengthTrack);
                                    tracks.add(track);
                                }

                                CompactDisc cd = new CompactDisc(id,title,category,director,cost,artist);
                                cd.addTrack(tracks);
                                items.add(cd);
                                System.out.println("Do you want to play?\n1.Yes  2.No");
                                System.out.print("You choose: ");
                                int chond = sc.nextInt();
                                sc.nextLine();
                                boolean checkd = true;
                                do{
                                    switch(chond){
                                        case 1:
                                            cd.play();
                                            for (Track track : tracks) {
                                                track.play();
                                            }
                                            checkd = false;
                                            break;
                                        case 2:
                                            checkd = false;
                                            break;
                                        default:
                                            System.out.println("Enter incorrectly, re-enter.");
                                            break;
                                    }
                                }while(checkd);
                                break;
                            case 3:
                                while (true){
                                    System.out.print("ID: ");
                                    id = sc.nextInt();
                                    sc.nextLine();
                                    if (check(items, id)) break;
                                    else System.out.println("ID already exist.");
                                }
                                while (true){
                                    System.out.print("Title: ");
                                    title = sc.nextLine();
                                    if (check(items, title)) break;
                                    else System.out.println("Title already exist.");
                                }
                                System.out.print("Category: ");
                                category = sc.nextLine();
                                System.out.print("Cost: ");
                                cost = sc.nextFloat();
                                sc.nextLine();
                                Book bk = new Book(id,title,category,cost);
                                items.add(bk);
                                break;
                            case 0:
                                System.out.println("Goodbye!");
                                checked = false;
                                break;

                            default:
                                System.out.println("Enter incorrectly, re-enter.");
                                break;
                        }
                    }while (checked);
                    break;
                case 2:

                    if(items.size() != 0) {
                        System.out.print("ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        int count = 0;
                        for (int i = 0; i < items.size(); i++) {
                            if (items.get(i).getId() == id) {
                                items.remove(i);
                                count++;
                                System.out.println("Deleted.");
                            }
                        }
                        if (count == 0) {
                            System.out.println("The searching id does not exist.");
                        }
                    } else System.out.println("Please choose 1 first.");
                    break;
                case 3:
                    if (items.size() != 0) {
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println(i + 1 + "." + items.get(i).showInfo());
                        }
                    } else System.out.println("Please choose 1 first.");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    check = false;
                    break;
                default:
                    System.out.println("Enter incorrectly, re-enter.");
                    break;
            }
        } while (check);
    }

    public static void showUserMenu(ArrayList<Media> items){
        Order order = new Order();
        ArrayList <Media> itemsOrdered = order.getItemsOrdered();

        Mydate date = new Mydate("mot", "hai", "2000");
        date.print();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        boolean check_case = false;
        int select;
        do {
            System.out.println("-------------------------------------");
            System.out.println("|Order Management Application:      |");
            System.out.println("|-----------------------------------|");
            System.out.println("|1. Create new order                |");
            System.out.println("|2. Add item to the order           |");
            System.out.println("|3. Delete item by id               |");
            System.out.println("|4. Display the items list of order |");
            System.out.println("|0. Exit                            |");
            System.out.println("-------------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            System.out.print("You choose: ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    if (createOrder() == null) {
                        break;
                    } else {
                        order.removeItem(itemsOrdered);
                        check_case = false;
                    }
                    break;
                case 2:
                    System.out.print("How many items do you want to add: ");
                    int it = sc.nextInt();
                    do {
                        System.out.print("enter the id code: ");
                        int id = sc.nextInt();
                        order.addItemById(id, items);
                    }
                    while (itemsOrdered.size() != it);
                    order.randomLuckyItem();
                    check_case = true;
                    break;
                case 3:
                    if (check_case) {
                        System.out.print("Enter the Id you want to delete: ");
                        int id = sc.nextInt();
                        order.removeItemById(id);
                    } else {
                        System.out.println("Please choose 2 first");
                    }
                    break;
                case 4:
                    if (check_case) {
                        order.show();
                    } else {
                        System.out.println("Please choose 2 first");
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    check = false;
                    break;
                default:
                    System.out.println("Enter incorrectly, re-enter");
                    break;
            }
        } while (check);
    }
}