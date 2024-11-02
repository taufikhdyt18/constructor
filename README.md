# Constructor
```
NIM     : 312310576
NAMA    : TAUFIK HIDAYAT
KELAS   : TI.23.A6
MATKUL  : Pemrograman Orientasi Objek
```
## Latihan Praktikum 3
![image](ss1/ss2.png)
## Penjelasan

#### Sistem Pegawai
- Mensimulasikan struktur dasar dalam manajemen sumber daya manusia. Kita memiliki kelas dasar Pegawai dengan dua kelas turunan, yaitu Manager dan Programmer, masing-masing memiliki atribut dan perilaku spesifik.

#### Kelas Pegawai (Kelas Dasar)
```
class Pegawai {
    protected String nama;
    protected double gajiPokok;

    // Constructor with no parameters
    public Pegawai() {
        this.nama = "";
        this.gajiPokok = 0.0;
    }

    // Constructor with name parameter
    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 0.0;
    }

    // Constructor with name and gajiPokok
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
```
#### Atribut:
- nama (String): Menyimpan nama pegawai.
- gajiPokok (double): Menyimpan gaji pokok pegawai.
#### Metode:
- setNama(String): Mengatur nama pegawai.
- getNama(): Mengembalikan nama pegawai.
- setGajiPokok(double): Mengatur gaji pokok pegawai.
- getGajiPokok(): Mengembalikan gaji pokok pegawai.
- cetakInfo(): Mencetak informasi dasar pegawai (nama dan gaji pokok).
#### Kelas Manager (Turunan dari Pegawai)
```
class Manager extends Pegawai {
    private double tunjangan;

    // Constructor with no parameters
    public Manager() {
        super();
        this.tunjangan = 0.0;
    }

    // Constructor with name and gajiPokok
    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.0;
    }

    // Constructor with name, gajiPokok, and tunjangan
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
```
#### Atribut:
- tunjangan (double): Menyimpan tunjangan khusus untuk seorang manager.
#### Metode:
- setTunjangan(double): Mengatur tunjangan manager.
- getTunjangan(): Mengembalikan tunjangan manager.
- cetakInfo(): Meng-override metode cetakInfo() untuk menambahkan informasi tentang tunjangan manager.

#### Kelas Programmer (Turunan dari Pegawai)
```
class Programmer extends Pegawai {
    private double bonus;

    // Constructor with name only
    public Programmer(String nama) {
        super(nama);
        this.bonus = 0.0;
    }

    // Constructor with name and gajiPokok
    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.bonus = 0.0;
    }

    // Constructor with name, gajiPokok, and bonus
    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + bonus);
    }
}
```
#### Atribut:
- bonus (double): Menyimpan bonus khusus untuk seorang programmer.
#### Metode:
- setBonus(double): Mengatur bonus programmer.
- getBonus(): Mengembalikan bonus programmer.
- cetakInfo(): Meng-override metode cetakInfo() untuk menambahkan informasi tentang bonus programmer.
### Constructor dan Overloading dalam Programmer
#### Constructor:

- Kelas Programmer memiliki constructor overload yang memungkinkan pembuatan objek dengan parameter yang berbeda (hanya nama, nama dengan gaji pokok, atau nama dengan gaji pokok dan bonus).
#### Polimorfisme:

- Manager dan Programmer keduanya meng-override cetakInfo() untuk menampilkan informasi spesifik (tunjangan untuk Manager dan bonus untuk Programmer), yang menunjukkan konsep polimorfisme.
### Sistem Keranjang Belanja
- Sistem Keranjang Belanja ini mensimulasikan keranjang belanja online dengan berbagai jenis produk. Kita memiliki kelas dasar Produk dengan tiga kelas turunan, yaitu Elektronik, Pakaian, dan Makanan, yang masing-masing mewakili jenis produk yang berbeda.

#### Kelas Produk (Kelas Dasar)
#### Atribut:
- namaProduk (String): Nama produk.
- harga (double): Harga produk.
- jumlahStok (int): Jumlah stok yang tersedia.
#### Metode:
- displayInfo(): Menampilkan informasi dasar produk (nama, harga, dan stok).
- Constructor: Kelas ini memiliki constructor untuk menginisialisasi atributnya.
- Kelas Elektronik (Turunan dari Produk)
#### Atribut:
- garansi (int): Masa garansi dalam tahun.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang masa garansi untuk produk elektronik.
- Kelas Pakaian (Turunan dari Produk)
#### Atribut:
- ukuran (String): Ukuran pakaian.
- warna (String): Warna pakaian.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang ukuran dan warna untuk produk pakaian.
- Kelas Makanan (Turunan dari Produk)
#### Atribut:
- tanggalKadaluwarsa (Date): Tanggal kedaluwarsa produk makanan.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang tanggal kedaluwarsa untuk produk makanan.
- Kelas KeranjangBelanja (Keranjang Belanja)
#### Atribut:
- produkList (List of Produk): Daftar yang menampung produk yang ditambahkan ke keranjang.
#### Metode:
- tambahProduk(Produk, int): Menambahkan produk ke keranjang jika stok mencukupi.
- hitungTotalBelanja(): Menghitung total harga semua produk dalam keranjang.
- displayKeranjang(): Menampilkan semua item di dalam keranjang dan total biaya.
