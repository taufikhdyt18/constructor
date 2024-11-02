import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Elektronik laptop = new Elektronik("Laptop", 15000000, 10, "2 tahun");
        Pakaian kaos = new Pakaian("Kaos", 100000, 50, "L", "Merah");
        Makanan roti = new Makanan("Roti", 15000, 100, LocalDate.of(2024, 12, 31));

        // Create shopping cart
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Add products to the cart
        keranjang.tambahProduk(laptop, 1);
        keranjang.tambahProduk(kaos, 2);
        keranjang.tambahProduk(roti, 5);

        // Display cart contents and total price
        keranjang.displayKeranjang();
    }
}