package set.www.recyclerview;

import java.sql.Time;

public class DataEmail {

    private String nama, subjek, isi, waktu, inisial;
    int inialbackground;

    public int getInialbackground() {
        return inialbackground;
    }

    public void setInialbackground(int inialbackground) {
        this.inialbackground = inialbackground;
    }

    public DataEmail(String nama, String subjek, String isi, String waktu, String inisial, int inialbackground) {
        this.nama = nama;
        this.subjek = subjek;
        this.isi = isi;
        this.waktu = waktu;
        this.inisial = inisial;
        this.inialbackground = inialbackground;
    }

    public String getWaktu(){
        return waktu;
    }

    public String getInisial() {
        return inisial;
    }

    public void setInisial(String inisial) {
        this.inisial = inisial;
    }

    public void setWaktu(String waktu){
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSubjek() {
        return subjek;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
