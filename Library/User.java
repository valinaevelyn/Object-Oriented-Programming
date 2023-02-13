package ALINEBELAJAR.Library;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String name;
    private Buku buku;
    private static ArrayList<Peminjaman> peminjamans = new ArrayList<>();

    public User() {

    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean validateLogin(String password, String username){
        if(password.compareTo(this.password) == 0 && username.compareTo(this.username) == 0){
            return true;
        }

        return false;
    }

    public void addPeminjaman(Peminjaman peminjaman){
        peminjamans.add(peminjaman);
    }

    public void removePeminjaman(Peminjaman peminjaman){
        peminjamans.remove(peminjaman);
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public ArrayList<Peminjaman> getPeminjamans() {
        return peminjamans;
    }

    public void setPeminjamans(ArrayList<Peminjaman> peminjamans) {
        this.peminjamans = peminjamans;
    }
    
    
}

