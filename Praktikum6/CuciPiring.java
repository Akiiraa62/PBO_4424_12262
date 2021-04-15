import java.util.Stack;  // Import library stack

public class CuciPiring {
    public static void main(String[] args) {
        Stack kotor = new Stack();      // Deklarasi objek stack kotor
        Stack bersih = new Stack();     // Deklarasi objek stack bersih
        for (int i = 1; i <= 5; i++)    // Perulangan for
        {
            kotor.push("piring " + i);      // Memasukkan data pada stack
        }
        System.out.println("-----SEBELUM DICUCI-----" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring kotor :");   // Menampilkan jumlah piring kotor

        for (int i = 1; i <= 5; i++)    // Perulangan for
        {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop());   // Mengeluarkan data pada stack
        }
        System.out.println("==========================");
        
        System.out.println("\n-----SETELAH DICUCI-----" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring bersih :");    //Menampilkan jumlah piring bersih dan piring yang telah dicuci
        for (int i = 4; i >= 0; i--)
        {
            System.out.println(bersih.elementAt(i));
        }
        System.out.println("==========================");
    }
}