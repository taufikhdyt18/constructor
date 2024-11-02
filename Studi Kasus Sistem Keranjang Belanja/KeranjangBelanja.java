import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk;

    // Constructor
    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    // Method to add products to the cart
    public void tambahProduk(Produk p, int jumlah) {
        if (p.jumlahStok >= jumlah) {
            p.jumlahStok -= jumlah;
            for (int i = 0; i < jumlah; i++) {
                daftarProduk.add(p);
            }
            System.out.println(jumlah + " " + p.namaProduk + " ditambahkan ke keranjang.");
        } else {
            System.out.println("Stok " + p.namaProduk + " tidak mencukupi.");
        }
    }

    // Calculate total price of products in cart
    public double hitungTotalBelanja() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.harga;
        }
        return total;
    }

    // Display cart content
    public void displayKeranjang() {
        System.out.println("Isi Keranjang Belanja:");
        for (Produk p : daftarProduk) {
            p.displayInfo();
            System.out.println();
        }
        System.out.println("Total Belanja: " + hitungTotalBelanja());
    }
}