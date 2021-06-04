public class Main{
    public static void main(String[] args){
        PersegiPanjang PersegiPanjang = new PersegiPanjang(4, 4, 5);
        System.out.println("Luas PersegiPanjang = " + PersegiPanjang.getLuas());
        System.out.println("Keliling PersegiPanjang = " + PersegiPanjang.getKeliling());
        Segitiga segitiga = new Segitiga(1, 5,6);
        System.out.println("Luas Segitiga = " + segitiga.getLuas());
        System.out.println("==========================================");
        PersegiPanjang.resize(2);
        System.out.println("Luas PersegiPanjang (setelah resize) = " + PersegiPanjang.getLuas());
        System.out.println("Keliling PersegiPanjang (setelah resize) = " + PersegiPanjang.getKeliling());
    }
}