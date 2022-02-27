package tugas1.sda;
import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("b");
        nama.add("i");
        nama.add("l");
        nama.add("a");

    nama.add(0, "e");
    System.out.println("elemen e ditambahkan pada index 0 = " + nama);    

    nama.add(2, "f");
    System.out.println("elemen f ditambahkan pada index 2 = " + nama);    

    nama.add(3, "g");
    System.out.println("elemen g ditambahkan pada index 3 = " + nama);    

    nama.add(4, "h");
    System.out.println("elemen h ditambahkan pada index 4 = " + nama);    

    nama.add(6, "h");
    System.out.println("elemen h ditambahkan pada index 6 = " + nama);    

    nama.add(-3, "j");
    System.out.println("elemen j ditambahkan pada index -3 = " + nama);    
    }    
}
