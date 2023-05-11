package uts_a11202113267;

public class MahasiswaLulus extends Mahasiswa {

    int tahunWisuda;
    float ipk;
    boolean ikut_wisuda;

    public boolean ikutWisuda() {
        if (ikut_wisuda == true) {
            return true;
        } else {
            return false;
        }
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        if (ikutWisuda()) {
            System.out.println("Tahun Wisuda : " + this.tahunWisuda);
        }
        System.out.println("IPK : " + this.ipk);

    }
}
