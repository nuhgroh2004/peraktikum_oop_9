public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2020, 250000000, "Crossover");
        SepedaMotor motor1 = new SepedaMotor("Honda", 2018, 25000000, 150);
        Truk truk1 = new Truk("Isuzu", 2022, 500000000, 16);

        // menampilkan info mendaran
        System.out.println(mobil1);
        // menampilkan biaya layanan
        mobil1.printhitungBiayaLayanan();
        // menampilkan harga jual second
        System.out.println(mobil1.beliSecond(2024));

        System.out.println();
        System.out.println();
        // menampilkan info mendaran
        System.out.println(motor1);
        // menampilkan biaya layanan
        motor1.printhitungBiayaLayanan();
        System.out.println(motor1.beliSecond(2024));

        System.out.println();
        System.out.println();
        // menampilkan info mendaran
        System.out.println(truk1);
        // menampilkan biaya layanan
        truk1.printhitungBiayaLayanan();
        // menampilkan harga jual second
        System.out.println(truk1.beliSecond(2024));
    }
}