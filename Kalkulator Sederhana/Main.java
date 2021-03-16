import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runOperasi();
    }
    public static void runOperasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---Kalkulator Sederhana--- \n");
        System.out.print("Masukan angka pertama : ");
        int AngkaPertama = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int AngkaKedua = scanner.nextInt();

        Operasi Kalkulator = new Operasi(AngkaPertama, AngkaKedua);
        System.out.println(AngkaPertama + " + " + AngkaKedua + " = " + Kalkulator.tambah());
        System.out.println(AngkaPertama + " / " + AngkaKedua + " = " + Kalkulator.bagi());
        System.out.println(AngkaPertama + " - " + AngkaKedua + " = " + Kalkulator.kurang());
        System.out.println(AngkaPertama + " x " + AngkaKedua + " = " + Kalkulator.kali());
        System.out.println(AngkaPertama + " % " + AngkaKedua + " = " + Kalkulator.mod());
    }
}