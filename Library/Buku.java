package ALINEBELAJAR.Library;

public class Buku {
    private String judul;
    private String pengarang;
    private boolean statusPeminjaman = false;

    public Buku(){

    }

    public Buku(String judul, String pengarang, boolean statusPeminjaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.statusPeminjaman = statusPeminjaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void ubahStatusPeminjaman(){
        this.statusPeminjaman = !this.statusPeminjaman;
    }

}
