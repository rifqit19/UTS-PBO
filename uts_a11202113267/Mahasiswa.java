package uts_a11202113267;

import java.util.ArrayList;

public class Mahasiswa {

    String nim, nama;
    int semester, usia;
    String[] krs;
    Integer[] nilai;

    public float hitungRataNilai(Integer[] nilai) {
        float total = 0;

        for (double n : nilai) {
            total += n;
        }

        return total / nilai.length;
    }

    public void infoMahasiswa() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Usia : " + this.usia);
        System.out.println("Semester : " + this.semester);
        System.out.println("Rata-rata Nilai : " + this.hitungRataNilai(nilai));

    }

    public void infoKrsMahasiswa() {
        System.out.println("Daftar KRS : ");
        int i = 0;
        for (String n : krs) {
            System.out.println("- " + n + " " + nilai[i]);
            i++;
        }
    }
}
