
import java.text.DecimalFormat;
class Truk extends PTMobilHebat {
    private int kapasitasAngkut;

    public Truk(String merek, int tahunProduksi, double harga, int kapasitasAngkut) {
        super(merek, tahunProduksi, harga);
        this.kapasitasAngkut = kapasitasAngkut;
    }

    @Override
    public double hitungBiayaLayanan() {
        double biaya = 0;
        if (kapasitasAngkut < 8.5) {
            biaya = 1500000;
        } else if (kapasitasAngkut < 16) {
            biaya = 2000000;
        } else if (kapasitasAngkut < 20) {
            biaya = 2500000;
        }
        return biaya;
    }
    
    public void printhitungBiayaLayanan(){
        System.out.println("Jenis kendaraan    = Truk");
        System.out.println("Kapasitas Angkut   = " + kapasitasAngkut + " ton");
        System.out.println("Biaya layanan      = Rp" + hitungBiayaLayanan() + "\n"
        + "-----------------------------------------------------\n"); 
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedHarga = "Rp" + formatter.format(super.getHarga());
        return "jenis kendaraan    = truk\n" +
                "merek              = " + super.getMerek() + "\n" +
                "tahun produksi     = " + super.getTahunProduksi() + "\n" +
                "harga              = " + formattedHarga + "\n" +
                "kapasitasAngkut    = " + kapasitasAngkut + "\n" +
                "-----------------------------------------------------\n";
    }
}