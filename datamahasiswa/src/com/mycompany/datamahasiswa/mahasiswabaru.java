package com.mycompany.datamahasiswa;

public class mahasiswabaru {
    private final String nama;
    private final String nim;
    private final String umur;
    
    public mahasiswabaru(String nama, String nim, String umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNIM() {
        return nim;
    }
    
    public String getUmur() {
        return umur;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Umur: " + umur;
    }
}
