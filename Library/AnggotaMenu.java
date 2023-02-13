package ALINEBELAJAR.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class AnggotaMenu {
    Scanner input = new Scanner(System.in);
    Anggota anggota;
    
    Buku buku;

    private void printMenu(){
        System.out.println("1. Lihat List Buku");
        System.out.println("2. Peminjaman Buku");
        System.out.println("3. Pengembalian Buku");
        System.out.println("4. Menampilkan Data Peminjaman");
        System.out.println(">> ");
    }

    private void printBuku(){
        int i = 0;
        for(Buku b: Library.getBukus()){
            System.out.println((i+1) + " " + Library.getBukus().get(i).getJudul() + " - " + Library.getBukus().get(i).getPengarang());
            if(Library.getBukus().get(i).getStatusPeminjaman() == false){
                System.out.println("Buku Tersedia");
            }else{
                System.out.println("Buku Tidak tersedia");
            }
            i++;
        }
    }

    private void peminjamanBuku(){
        printBuku();

        int choice;
        do{
            System.out.println("Choice book: ");
            choice = input.nextInt(); input.nextLine();
        }while(choice < 0 || choice > Library.getBukus().size());

        Buku sem = Library.getBukus().get(choice-1);
        sem.ubahStatusPeminjaman();
        Peminjaman temp = new Peminjaman(sem); 
        anggota.addPeminjaman(temp);
        System.out.println("Buku Berhasil Dipinjam! Jangan Lupa Balikin!");
    }

    private void pengembalianBuku(){
        dataPeminjaman();

        int choice;
        do{
            System.out.println("Choice book: ");
            choice = input.nextInt(); input.nextLine();
        }while(choice < 0 || choice > anggota.getPeminjamans().size());

        // set status buku menjadi false, dan hapus dari data peminjaman
        Buku sem = anggota.getPeminjamans().get(choice-1).getBukuPinjam();
        sem.ubahStatusPeminjaman();
        anggota.removePeminjaman(anggota.getPeminjamans().get(choice-1));
        System.out.println("Buku Berhasil Dikembalikan!");
    }

    private void dataPeminjaman(){
        int j = 0;
        for(Peminjaman p: anggota.getPeminjamans()){
            System.out.println((j+1) + " " + p.getBukuPinjam().getJudul() + " - " + p.getBukuPinjam().getPengarang());
            j++;
        }     
    }

    public void running(){
        int menu = 0;
        do{
            printMenu();
            menu = input.nextInt(); input.nextLine();

            switch(menu){
                case 1:{
                    // Lihat List Buku
                    printBuku();
                    break;
                }

                case 2:{
                    // Peminjaman Buku
                    peminjamanBuku();
                    break;
                }

                case 3:{
                    // Pengembalian Buku
                    pengembalianBuku();
                    break;
                }

                case 4:{
                    // Print Data Peminjaman
                    dataPeminjaman();
                    break;
                }

                case 5:{
                    
                }

                default:{
                    break;
                }
            }
        }while(menu != 4);
    }

    public AnggotaMenu(){

    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }   
}
