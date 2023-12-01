package com.mycompany.datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<mahasiswabaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<mahasiswabaru>();
    }
    
    public void InsertData(String nama, String nim, String umur){
        mahasiswabaru mhs = new mahasiswabaru(nama, nim, umur);
        ArrayData.add(mhs);
    }

    // Method untuk menghapus semua data dari ArrayData
    public void clearData(){
        ArrayData.clear();
        // Memberitahu DefaultTableModel bahwa data telah berubah
        tablelist.fireTableDataChanged();
    }
    
    public DefaultTableModel showData(){
        String[] kolom = { "Nama", "NIM", "Umur"};
        Object[][] objData = new Object[ArrayData.size()][3];
        
        for (int i = 0; i < ArrayData.size(); i++) {
            mahasiswabaru n = ArrayData.get(i);
            objData[i][0] = n.getNama();
            objData[i][1] = n.getNIM();
            objData[i][2] = n.getUmur();
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
    
        return tablelist;
    }
}
