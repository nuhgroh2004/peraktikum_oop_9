import java.text.DecimalFormat;

class Mobil extends PTMobilHebat {
    private String tipeMobil;

    public Mobil(String merek, int tahunProduksi, double harga, String tipeMobil) {
        super(merek, tahunProduksi, harga);
        this.tipeMobil = tipeMobil;
    }

    @Override
    public double hitungBiayaLayanan() {
        double biaya = 0;
        switch (tipeMobil) {
            case "SUV":
                biaya = 1000000;
                break;
            case "Sedan":
                biaya = 800000;
                break;
            case "Double Cabin":
                biaya = 900000;
                break;
            case "Crossover":
                biaya = 1200000;
                break;
            case "Hatchback":
                biaya = 700000;
                break;
        }
        return biaya;
    }

    public void printhitungBiayaLayanan(){
        System.out.println("Jenis kendaraan    = Mobil");
        System.out.println("Tipe mobil         = " + tipeMobil);
        System.out.println("Biaya layanan      = Rp" + hitungBiayaLayanan() + "\n"
        + "-----------------------------------------------------\n");
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedHarga = "Rp" + formatter.format(super.getHarga());
        return "jenis kendaraan    = mobil\n" +
                "merek              = " + super.getMerek() + "\n" +
                "tahun produksi     = " + super.getTahunProduksi() + "\n" +
                "harga              = " + formattedHarga + "\n" +
                "tipe               = " + tipeMobil + "\n" +
                "-----------------------------------------------------\n";
    }
}