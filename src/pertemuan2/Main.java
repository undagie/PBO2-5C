package pertemuan2;

public class Main {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa baihaki = new Mahasiswa("Baihaki Aja","2110010089",20);
        
        baihaki.setUmur(25);
        
        System.out.println("Nama saat ini: "+baihaki.getNama());
        baihaki.setNama("Baihaki");
        baihaki.tampilData();
        baihaki.tampilData("5C Banjarmasin");
        
        MahasiswaInternasional masuti = new MahasiswaInternasional("Mc Masuti","2110010111",20,"Canada");
        masuti.tampilData();
    }
}
