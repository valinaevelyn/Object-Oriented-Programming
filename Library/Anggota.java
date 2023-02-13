package ALINEBELAJAR.Library;

import java.util.ArrayList;

public class Anggota extends User{
    private static int anggotaID = 1;
    private int id = setAnggotaID();
    public Anggota(){
        super();
    }

    public Anggota(String username, String password, String name){
        super(username, password, name);
    }

    private int setAnggotaID(){
        return anggotaID++;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
