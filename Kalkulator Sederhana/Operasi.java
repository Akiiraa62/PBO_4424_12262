public class Operasi {
    int AngkaPertama;
    int AngkaKedua;

    public Operasi(int AngkaPertama, int AngkaKedua) {
        this.AngkaPertama = AngkaPertama;
        this.AngkaKedua = AngkaKedua;
    }
    public int tambah() {
        return this.AngkaPertama + this.AngkaKedua;
    }
    public int bagi() {
        return this.AngkaPertama / this.AngkaKedua;
    }
    public int kurang() {
        return this.AngkaPertama - this.AngkaKedua;
    }
    public int kali() {
        return this.AngkaPertama * this.AngkaKedua;
    }
    public int mod() {
        return this.AngkaPertama % this.AngkaKedua;
    }
}