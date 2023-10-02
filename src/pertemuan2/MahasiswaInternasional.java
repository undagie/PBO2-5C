package pertemuan2;

//inheritance dari class Mahasiswa
public class MahasiswaInternasional extends Mahasiswa {
    private String asalNegara;
    
    public MahasiswaInternasional(String nama, String npm, int umur, String asalNegara){
        super(nama, npm, umur);
        this.asalNegara = asalNegara;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public void setAsalNegara(String asalNegara) {
        this.asalNegara = asalNegara;
    }
    
    //polimorfisme bertipe overiding
    public void tampilData(){
        super.tampilData();
        System.out.println("Asal negara: "+asalNegara);
    }
    
    
}
