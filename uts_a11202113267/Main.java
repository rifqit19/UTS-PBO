package uts_a11202113267;

/*
 * UTS Praktikum
 * Pemrograman Berorientasi Objek
 * 
 * Rifqi Triginandri
 * A11.2021.13267
 * A11.4412
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = "";
        String input_data = "ya";
        String input_matkul = "";
        int input_nilai;

        while (!input.equals("0")) {
            System.out.println("\nProgram Data Mahasiswa: ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("\nPilih menu: ");
            input = scanner.nextLine();

            if (input.endsWith("1")) {
                System.out.print("Masukan Kategori Mahasiswa(baru/lulus/aktif): ");
                input = scanner.nextLine();

                switch (input) {
                    case "baru":
                        System.out.print("Apakah mahasiswa transfer?(ya/tidak): ");
                        input = scanner.nextLine();

                        if (input.equals("ya")) {
                            do {
                                System.out.println("\nMasukkan Data Mahasiswa Transfer");
                                MahasiswaTransfer mTransfer = new MahasiswaTransfer();

                                System.out.print("NIM : ");
                                mTransfer.nim = scanner.nextLine();

                                System.out.print("Nama : ");
                                mTransfer.nama = scanner.nextLine();

                                System.out.print("Asal Universitas: ");
                                mTransfer.asalUniversitas = scanner.nextLine();

                                System.out.print("Asal Sekolah: ");
                                mTransfer.asalSekolah = scanner.nextLine();

                                System.out.print("Semester : ");
                                mTransfer.semester = scanner.nextInt();

                                System.out.print("Usia: ");
                                mTransfer.usia = scanner.nextInt();

                                System.out.print("KRS :");
                                ArrayList<String> matkul = new ArrayList<>();
                                ArrayList<Integer> nilai = new ArrayList<>();
                                int i = 0;
                                do {
                                    scanner = new Scanner(System.in);
                                    System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                    input_matkul = scanner.nextLine();
                                    matkul.add(input_matkul);

                                    scanner = new Scanner(System.in);
                                    System.out.print("nilai " + input_matkul + " = ");
                                    input_nilai = scanner.nextInt();
                                    nilai.add(input_nilai);

                                    System.out.print("\nTambahkan matakuliah?(ya/tidak): ");
                                    input_data = scanner.next();

                                    i++;
                                } while (!input_data.equals("tidak"));

                                mTransfer.krs = matkul.toArray(new String[0]);
                                mTransfer.nilai = nilai.toArray(new Integer[0]);

                                mahasiswas.add(mTransfer);

                                scanner = new Scanner(System.in);
                                System.out.print("\nTambahkan lagi data mahasiswa transfer?(ya/tidak): ");
                                input_data = scanner.nextLine();

                            } while (!input_data.equals("tidak"));

                        } else if (input.equals("tidak")) {
                            do {
                                System.out.println("\nMasukkan Data Mahasiswa Baru ");
                                MahasiswaBaru mBaru = new MahasiswaBaru();

                                System.out.print("NIM : ");
                                mBaru.nim = scanner.nextLine();

                                System.out.print("Nama : ");
                                mBaru.nama = scanner.nextLine();

                                System.out.print("Asal Sekolah: ");
                                mBaru.asalSekolah = scanner.nextLine();

                                System.out.print("Semester : ");
                                mBaru.semester = scanner.nextInt();

                                System.out.print("Usia: ");
                                mBaru.usia = scanner.nextInt();

                                System.out.print("KRS :");
                                ArrayList<String> matkul = new ArrayList<>();
                                ArrayList<Integer> nilai = new ArrayList<>();
                                int i = 0;
                                do {
                                    scanner = new Scanner(System.in);
                                    System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                    input_matkul = scanner.nextLine();
                                    matkul.add(input_matkul);

                                    scanner = new Scanner(System.in);
                                    System.out.print("nilai " + input_matkul + " = ");
                                    input_nilai = scanner.nextInt();
                                    nilai.add(input_nilai);

                                    System.out.print("\nTambahkan matakuliah?(ya/tidak): ");
                                    input_data = scanner.next();

                                    i++;
                                } while (!input_data.equals("tidak"));

                                mBaru.krs = matkul.toArray(new String[0]);
                                mBaru.nilai = nilai.toArray(new Integer[0]);

                                mahasiswas.add(mBaru);

                                scanner = new Scanner(System.in);
                                System.out.print("\nTambahkan lagi data mahasiswa baru?(ya/tidak): ");
                                input_data = scanner.nextLine();

                            } while (!input_data.equals("tidak"));

                        } else {
                            System.out.println("input tidak valid");
                        }
                        break;
                    case "lulus":
                        do {

                            System.out.println("\nMasukkan Data Mahasiswa Lulus");
                            MahasiswaLulus mLulus = new MahasiswaLulus();

                            System.out.print("NIM : ");
                            mLulus.nim = scanner.nextLine();

                            System.out.print("Nama : ");
                            mLulus.nama = scanner.nextLine();

                            System.out.print("Mengikuti wisuda?(ya/tidak): ");
                            String wisuda = scanner.nextLine();

                            if (wisuda.equals("ya")) {
                                mLulus.ikut_wisuda = true;
                                System.out.print("Tahun Wisuda: ");
                                mLulus.tahunWisuda = scanner.nextInt();
                            } else {
                                mLulus.ikut_wisuda = false;
                            }

                            System.out.print("Semester : ");
                            mLulus.semester = scanner.nextInt();

                            System.out.print("Usia: ");
                            mLulus.usia = scanner.nextInt();

                            System.out.print("IPK: ");
                            mLulus.ipk = scanner.nextFloat();

                            System.out.print("KRS :");
                            ArrayList<String> matkul = new ArrayList<>();
                            ArrayList<Integer> nilai = new ArrayList<>();
                            int i = 0;
                            do {
                                scanner = new Scanner(System.in);
                                System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                input_matkul = scanner.nextLine();
                                matkul.add(input_matkul);

                                scanner = new Scanner(System.in);
                                System.out.print("nilai " + input_matkul + " = ");
                                input_nilai = scanner.nextInt();
                                nilai.add(input_nilai);

                                System.out.print("\nTambahkan matakuliah?(ya/tidak): ");
                                input_data = scanner.next();

                                i++;
                            } while (!input_data.equals("tidak"));

                            mLulus.krs = matkul.toArray(new String[0]);
                            mLulus.nilai = nilai.toArray(new Integer[0]);

                            mahasiswas.add(mLulus);

                            scanner = new Scanner(System.in);
                            System.out.print("\nTambahkan lagi data mahasiswa lulus?(ya/tidak): ");
                            input_data = scanner.nextLine();

                        } while (!input_data.equals("tidak"));

                        break;
                    case "aktif":
                        do {
                            System.out.println("\nMasukkan Data Mahasiswa Aktif: ");
                            MahasiswaAktif mAktif = new MahasiswaAktif();

                            System.out.print("NIM : ");
                            mAktif.nim = scanner.nextLine();

                            System.out.print("Nama : ");
                            mAktif.nama = scanner.nextLine();

                            System.out.print("Semester : ");
                            mAktif.semester = scanner.nextInt();

                            System.out.print("Usia: ");
                            mAktif.usia = scanner.nextInt();

                            System.out.print("KRS :");
                            ArrayList<String> matkul = new ArrayList<>();
                            ArrayList<Integer> nilai = new ArrayList<>();
                            int i = 0;
                            do {
                                scanner = new Scanner(System.in);
                                System.out.print("\nMatakuliah ke-" + (i + 1) + " = ");
                                input_matkul = scanner.nextLine();
                                matkul.add(input_matkul);

                                scanner = new Scanner(System.in);
                                System.out.print("nilai " + input_matkul + " = ");
                                input_nilai = scanner.nextInt();
                                nilai.add(input_nilai);

                                scanner = new Scanner(System.in);
                                System.out.print("\nTambahkan matakuliah?(ya/tidak): ");
                                input_data = scanner.next();

                                i++;
                            } while (!input_data.equals("tidak"));

                            mAktif.krs = matkul.toArray(new String[0]);
                            mAktif.nilai = nilai.toArray(new Integer[0]);

                            mahasiswas.add(mAktif);

                            scanner = new Scanner(System.in);
                            System.out.print("\nTambahkan lagi data mahasiswa aktif?(ya/tidak): ");
                            input_data = scanner.nextLine();

                        } while (!input_data.equals("tidak"));

                        break;
                    default:
                        break;
                }

            } else if (input.endsWith("2")) {
                for (int i = 0; i < mahasiswas.size(); i++) {
                    System.out.println("\nData mahasiswa ke-" + (i + 1));
                    System.out.println("----------------------");
                    mahasiswas.get(i).infoMahasiswa();
                    mahasiswas.get(i).infoKrsMahasiswa();
                }

            } else if (input.endsWith("0")) {
                System.out.print("Keluar");
            } else {
                System.out.print("Menu tidak tersedia");

            }
        }
        scanner.close();

    }

}
