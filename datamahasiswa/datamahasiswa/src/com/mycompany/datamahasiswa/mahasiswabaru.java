/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datamahasiswa;

public class mahasiswabaru {
    private final String bulan;
    private final String hari;
    private final int tanggal;
    
    public mahasiswabaru(String bulan, String hari, int tanggal) {
        this.bulan = bulan;
        this.hari = hari;
        this.tanggal = tanggal;
    }
    
    public String getBulan() {
        return bulan;
    }
    
    public String getHari() {
        return hari;
    }
    
    public int getTanggal() {
        return tanggal;
    }
    
    @Override
    public String toString() {
        return "Bulan: " + bulan + ", Hari: " + hari + ", Tanggal: " + tanggal;
    }
}
