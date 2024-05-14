import java.text.DecimalFormat;

class PTMobilHebat {
    private String merek;
    private int tahunProduksi;
    private double harga;

    public PTMobilHebat(String merek, int tahunProduksi, double harga) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }
    public String getMerek() {
        return merek;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public double getHarga() {
        return harga;
    }
    
    public double hitungBiayaLayanan() {
        return 0;
    }

    public String beliSecond(int tahunBeli) {
        int selisihTahun = tahunBeli - tahunProduksi;
        double hargaSecond = harga;
        double hargaAwal = harga;
        for (int i = 0; i < selisihTahun; i++) {
            hargaSecond *= 0.9;
        }
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedHargaSecond = "Rp" + formatter.format(hargaSecond);
        String formattedHargaAwal = "Rp" + formatter.format(hargaAwal);
        return "Harga pada tahun produksi " + getTahunProduksi() + " = " + formattedHargaAwal + "\n" +
               "Harga jual pada tahun     " + tahunBeli + " = " + formattedHargaSecond + "\n" +
               "-----------------------------------------------------\n";
    }
}