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
public class Program {

    
    public static void main(String[] args) {
        Android oo1 = new Android("Samsung","Android","Grand",3000000);
        oo1.displayProduct();
        oo1.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : " + oo1.getKeyStore());
        System.out.println();
        
        Blackberry oo2 = new Blackberry("BlackB","RIM","Curve",2000000);
        oo2.displayProduct();
        oo2.setPinBB("BHS249");
        System.out.println("PIN : " + oo2.getPinBB());
        System.out.println();
        
        WindowsPhone oo3 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        oo3.displayProduct();
        oo3.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : " + oo3.getWpKeyStore());
    }
    
}
