package uts_a11202113267;

public class MahasiswaTransfer extends MahasiswaBaru {

    String asalUniversitas;

    public boolean ikutOspek() {
        return super.ikutOspek();
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + this.asalUniversitas);
    }
}
