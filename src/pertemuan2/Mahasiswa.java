package pertemuan2;

public class Mahasiswa {
    //membuat atribut
    String nama, npm;
    int umur;
    
    //membuat constructor
    Mahasiswa(){
        System.out.println("Menjalankan konstruktor mahasiswa");
    }
    
    Mahasiswa(String nama, String npm, int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    //method untuk menampilkan data
    void tampilData(){
        System.out.println("Nama: "+nama);
        System.out.println("NPM: "+npm);
        System.out.println("Umur: "+umur);
    }
    
    //membuat method setter
    void setNama(String nama){
        this.nama = nama;
    }
    
    //membuat method accessor
    String getNama(){
        return nama;
    }
    
    //membuat method setter
    void setNpm(String npm){
        this.npm = npm;
    }
    
    //membuat method accessor
    String getNpm(){
        return npm;
    }
    
    //membuat method setter
    void setUmur(int umur){
        this.umur = umur;
    }
    
    //membuat method accessor
    int getUmur(){
        return umur;
    }
}
