import java.text.DecimalFormat;

class SepedaMotor extends PTMobilHebat {
    private int jenisMesin;

    public SepedaMotor(String merek, int tahunProduksi, double harga, int jenisMesin) {
        super(merek, tahunProduksi, harga);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public double hitungBiayaLayanan() {
        double biaya = 0;
        switch (jenisMesin) {
            case 110:
                biaya = 100000;
                break;
            case 125:
                biaya = 150000;
                break;
            case 150:
                biaya = 200000;
                break;
            case 250:
                biaya = 300000;
                break;
            case 500:
                biaya = 400000;
                break;
            case 1000:
                biaya = 500000;
                break;
        }
        return biaya;
    }
    
    public void printhitungBiayaLayanan(){
        System.out.println("Jenis kendaraan    = Sepeda motor");
        System.out.println("Tipe mesin         = " + jenisMesin);
        System.out.println("Biaya layanan      = Rp"+hitungBiayaLayanan()+"\n"
        + "-----------------------------------------------------\n");
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedHarga = "Rp" + formatter.format(super.getHarga());
        return "jenis kendaraan    = motor\n" +
                "merek              = " + super.getMerek() + "\n" +
                "tahun produksi     = " + super.getTahunProduksi() + "\n" +
                "harga              = " + formattedHarga + "\n" +
                "tipeMesin          = " + jenisMesin + "\n" +
                "-----------------------------------------------------\n";
    }
}