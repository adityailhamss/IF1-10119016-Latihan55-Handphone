package if1.pkg1011906.latihan55.handphone;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan macam macam merk handphone
 */
public class Blackberry extends Handphone{
    
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getPinBB(){
        return pinBB;
    }
    
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}