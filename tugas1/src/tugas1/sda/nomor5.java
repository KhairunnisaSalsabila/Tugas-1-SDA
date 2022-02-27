package tugas1.sda;
import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("b");
        nama.add("i");
        nama.add("l");
        nama.add("a");
    
    System.out.println("ArrayList sebelum di remove = ");
    for(String var: nama) {
        System.out.println(var);
    }
   
        nama.remove(0);
        nama.remove(3);
        nama.remove(3);

        System.out.println("ArrayList setelah di remove = ");
        for(String var2: nama) {
            System.out.println(var2);
        }    
        
    }    
}
