package pertemuan2;

public class Main {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa baihaki = new Mahasiswa("Baihaki Aja","2110010089",20);
        
        System.out.println("Nama saat ini: "+baihaki.getNama());
        baihaki.setNama("Baihaki");
        baihaki.tampilData();
    }
}
