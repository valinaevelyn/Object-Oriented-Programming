package ALINEBELAJAR.Library;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Buku> bukus = new ArrayList<>();

    public Library(){

    }

    public static void addBuku(Buku buku){
        bukus.add(buku);
    }

    public static void removeBuku(Buku buku){
        bukus.remove(buku);
    }

    public static ArrayList<Buku> getBukus() {
        return bukus;
    }

    public void setBukus(ArrayList<Buku> bukus) {
        this.bukus = bukus;
    }

}
