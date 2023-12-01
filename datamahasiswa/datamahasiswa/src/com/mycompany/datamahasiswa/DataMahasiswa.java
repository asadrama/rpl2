/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
            List<mahasiswabaru> daftarMahasiswa = new ArrayList<>();
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Buat Planner Baru (y/n): ");
                String jawaban = input.nextLine();

                if (jawaban.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.print("Bulan: ");
                String bulan = input.nextLine();

                System.out.print("Hari: ");
                String hari = input.nextLine();

                System.out.print("Tanggal: ");
                int tanggal = input.nextInt();
                input.nextLine();

                mahasiswabaru mahasiswa = new mahasiswabaru(bulan, hari, tanggal);
                daftarMahasiswa.add(mahasiswa);
            }
            System.out.println("Daftar Mahasiswa: ");
            for (mahasiswabaru mahasiswa : daftarMahasiswa) {
                System.out.println(mahasiswa);
            }
        }
}
