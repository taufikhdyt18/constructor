import java.time.LocalDate;

class Makanan extends Produk {
    private LocalDate tanggalKadaluwarsa;

    // Constructor
    public Makanan(String namaProduk, double harga, int jumlahStok, LocalDate tanggalKadaluwarsa) {
        super(namaProduk, harga, jumlahStok);
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tanggal Kadaluwarsa: " + tanggalKadaluwarsa);
    }
}