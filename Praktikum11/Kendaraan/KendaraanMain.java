public class KendaraanMain extends Kendaraan {
    private int kondisiAwal;

    @Override
    public void nyalakan() {
        kondisiAwal=0;
        System.out.println("Kecepatan awal sebelum dinyalakan adalah "+kondisiAwal+" km/jam");
    }

    public static void main(String[] args) {
        KendaraanMain panggil = new KendaraanMain();
        panggil.nyalakan();
    }

    // Jawaban 1.1
}