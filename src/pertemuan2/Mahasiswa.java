package pertemuan2;

public class Mahasiswa {
    //membuat atribut
    private String nama, npm;
    private int umur;

    public Mahasiswa(String nama, String npm, int umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if(umur>0){
            this.umur = umur;
        }
    }
    
    public void tampilData(){
        System.out.println("Nama: "+nama);
        System.out.println("NPM: "+npm);
        System.out.println("Umur: "+umur);
    }
    
    //polimorfisme bertipe overloading
    public void tampilData(String kelas){
        tampilData();
        System.out.println("Kelas: "+kelas);
    }
    
    
}
