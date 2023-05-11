package uts_a11202113267;

public class MahasiswaBaru extends Mahasiswa {

    String asalSekolah;

    public boolean ikutOspek() {
        if (super.semester > 1) {
            return false;
        } else {
            return true;
        }

    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("ikut Ospek : " + (ikutOspek() ? "Wajib" : "Tidak Wajib"));
        System.out.println("Asal Sekolah : " + this.asalSekolah);

    }

}
