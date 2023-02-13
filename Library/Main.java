package ALINEBELAJAR.Library;

import java.util.Scanner;

import ALINEBELAJAR.BANK.nasabahMenu;
import User.Nasabah;

public class Main {
    Scanner scan = new Scanner(System.in);
    Anggota anggota = new Anggota("valinaevelyn", "alin123", "Valina Evelyn Pranoto");
    // NasabahMenu nasabahMenu = new NasabahMenu();
    AnggotaMenu anggotaMenu = new AnggotaMenu();

    String username, password;

    public static void dataDummyBuku(){
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", false);
        Buku buku2 = new Buku("The Lord of the Rings", "J.R.R. Tolkien", false);
        Buku buku3 = new Buku("The Hobbit", "J.R.R. Tolkien", false);
        Buku buku4 = new Buku("The Da Vinci Code", "Dan Brown", false);
        Buku buku5 = new Buku("Angels & Demons", "Dan Brown", false);

        Library.addBuku(buku1);
        Library.addBuku(buku2);
        Library.addBuku(buku3);
        Library.addBuku(buku4);
        Library.addBuku(buku5);
    }

    public Main(){
        dataDummyBuku();
        do{
            System.out.println("Login");
            System.out.println("==============");
            System.out.println("Input Username: ");
            username = scan.nextLine();

            System.out.println("Input Password");
            password = scan.nextLine();
        }while(!anggota.validateLogin(password, username));
        anggotaMenu.setAnggota(anggota);
        anggotaMenu.running();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
