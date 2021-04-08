package hedspi.test.disc;

import hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
//    public static void main(String[] args){
//        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
//
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
//
//        changeTitle(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
//    }
//
////    public static void swap(Object o1, Object o2){
////        Object tmp = o1;
////        o1 = o2;
////        o2 = tmp;
////    }
////
//    public static void changeTitle(DigitalVideoDisc dvd, String title){
//        String oldTile = dvd.getTitle();
//        dvd.setTitle(title);
//        dvd = new DigitalVideoDisc(oldTile);
//    }
//
//    public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
//        DigitalVideoDisc d = new DigitalVideoDisc();
//        d.setTitle(dvd1.getTitle());
//        d.setCategory(dvd1.getCategory());
//        d.setCost(dvd1.getCost());
//        d.setDirector(dvd1.getDirector());
//        d.setLength(dvd1.getLength());
//
//        dvd1.setTitle(dvd2.getTitle());
//        dvd1.setCategory(dvd2.getCategory());
//        dvd1.setCost(dvd2.getCost());
//        dvd1.setDirector(dvd2.getDirector());
//        dvd1.setLength(dvd2.getLength());
//
//        dvd2.setTitle(d.getTitle());
//        dvd2.setCategory(d.getCategory());
//        dvd2.setCost(d.getCost());
//        dvd2.setDirector(d.getDirector());
//        dvd2.setLength(d.getLength() );
//    }



}


//    int id_cd;
//                                while (true){
//                                        System.out.print("ID: ");
//                                        id_cd = sc.nextInt();
//                                        sc.nextLine();
//                                        if (check(items, id_cd)) break;
//                                        else System.out.println("ID already exist");
//                                        }
//                                        String title_cd;
//                                        while (true){
//                                        System.out.print("Title: ");
//                                        title_cd = sc.nextLine();
//                                        if (check(items, title_cd)) break;
//                                        else System.out.println("Title already exist");
//                                        }
//                                        System.out.print("Category: ");
//                                        String category_cd = sc.nextLine();
//                                        System.out.print("Director: ");
//                                        String director_cd = sc.nextLine();
//                                        System.out.print("Length: ");
//                                        float length_cd = sc.nextFloat();
//                                        sc.nextLine();
//                                        System.out.print("Cost: ");
//                                        float cost_cd = sc.nextFloat();
//                                        sc.nextLine();
//                                        System.out.print("Artist: ");
//                                        String artist = sc.nextLine();
//                                        CompactDisc cd = new CompactDisc(id_cd,title_cd,category_cd,director_cd,length_cd, cost_cd,artist);
//                                        System.out.print("How many tracks do you want to add: ");
//                                        int it = sc.nextInt();
//                                        sc.nextLine();
//                                        int Id;
//                                        do {
//                                        System.out.print("enter the id code: ");
//                                        Id = sc.nextInt();
//                                        cd.addTrackById(Id,tracks);
//                                        }
//                                        while (tracks.size() != it);
