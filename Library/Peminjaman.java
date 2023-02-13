package ALINEBELAJAR.Library;

import ALINEBELAJAR.BANK.Nasabah;

public class Peminjaman {
    private static Buku bukuPinjam;
    private static int dayCount;

    public Peminjaman(){

    }

    public Peminjaman(Buku bukuPinjam) {
        super();
        this.bukuPinjam = bukuPinjam;
        this.dayCount = 0;
    }

    public static Buku getBukuPinjam() {
        return bukuPinjam;
    }

    public void setBukuPinjam(Buku bukuPinjam) {
        this.bukuPinjam = bukuPinjam;
    }

    public static int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    
}
