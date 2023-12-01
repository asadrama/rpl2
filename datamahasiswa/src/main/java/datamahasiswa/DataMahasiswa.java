package datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main (String[] args) {
        List<mahasiswabaru> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
            while (true) {
                System.out.println("Tambah Data Barang Baru (y/n): ");
                String jawaban = input.nextLine();
                
                if (jawaban.equalsIgnoreCase("n")){
                    break;
                }
                System.out.print("Nama Barang: ");
                String namabarang = input.nextLine();
                
                System.out.print("Quantity: ");
                String quantity = input.nextLine();
                
                System.out.print("ID Barang: ");
                int id_barang = input.nextInt();
                input.nextLine();
                
                mahasiswabaru mahasiswa = new mahasiswabaru(namabarang, quantity, id_barang);
                daftarMahasiswa.add(mahasiswa);
            }
            
            System.out.println("Data Barang");
            for (mahasiswabaru mahasiswa : daftarMahasiswa) {
                System.out.println(mahasiswa);             
            }
        }
    }