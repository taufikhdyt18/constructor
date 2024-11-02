class Elektronik extends Produk {
    private String garansi; // Example: "1 tahun" or "2 tahun"

    // Constructor
    public Elektronik(String namaProduk, double harga, int jumlahStok, String garansi) {
        super(namaProduk, harga, jumlahStok);
        this.garansi = garansi;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Garansi: " + garansi);
    }
}