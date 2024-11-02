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

![image](ss1/ss4.png)
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
![gambar](ss1/ss6.png)
#### Atribut:
- tunjangan (double): Menyimpan tunjangan khusus untuk seorang manager.
#### Metode:
- setTunjangan(double): Mengatur tunjangan manager.
- getTunjangan(): Mengembalikan tunjangan manager.
- cetakInfo(): Meng-override metode cetakInfo() untuk menambahkan informasi tentang tunjangan manager.

#### Kelas Programmer (Turunan dari Pegawai)
![gambar](ss1/ss7.png)
#### Atribut:
- bonus (double): Menyimpan bonus khusus untuk seorang programmer.
#### Metode:
- setBonus(double): Mengatur bonus programmer.
- getBonus(): Mengembalikan bonus programmer.
- cetakInfo(): Meng-override metode cetakInfo() untuk menambahkan informasi tentang bonus programmer.
### Constructor dan Overloading dalam Programmer
#### Main.Java
![gambaar](ss1/ss5.png)
- Kelas Programmer memiliki constructor overload yang memungkinkan pembuatan objek dengan parameter yang berbeda (hanya nama, nama dengan gaji pokok, atau nama dengan gaji pokok dan bonus).
#### Polimorfisme:

- Manager dan Programmer keduanya meng-override cetakInfo() untuk menampilkan informasi spesifik (tunjangan untuk Manager dan bonus untuk Programmer), yang menunjukkan konsep polimorfisme.
### Output
![image](ss1/ss1.png)
## Studi Kasus : Sistem Pembelian Online Dengan Keranjang Belanja
![image](ss1/ss3.png)
- Sistem Keranjang Belanja ini mensimulasikan keranjang belanja online dengan berbagai jenis produk. Kita memiliki kelas dasar Produk dengan tiga kelas turunan, yaitu Elektronik, Pakaian, dan Makanan, yang masing-masing mewakili jenis produk yang berbeda.

#### Kelas Produk (Kelas Dasar)
![image](ss2/ss1.png)
#### Atribut:
- namaProduk (String): Nama produk.
- harga (double): Harga produk.
- jumlahStok (int): Jumlah stok yang tersedia.
#### Metode:
- displayInfo(): Menampilkan informasi dasar produk (nama, harga, dan stok).
- Constructor: Kelas ini memiliki constructor untuk menginisialisasi atributnya.
#### Kelas Elektronik (Turunan dari Produk)
![gambar](ss2/ss2.png)
#### Atribut:
- garansi (int): Masa garansi dalam tahun.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang masa garansi untuk produk elektronik.
#### Kelas Pakaian (Turunan dari Produk)
![gambar](ss2/ss3.png)
#### Atribut:
- ukuran (String): Ukuran pakaian.
- warna (String): Warna pakaian.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang ukuran dan warna untuk produk pakaian.
#### Kelas Makanan (Turunan dari Produk)
![image](ss2/ss4.png)

#### Atribut:
- tanggalKadaluwarsa (Date): Tanggal kedaluwarsa produk makanan.
#### Metode:
- displayInfo(): Meng-override metode displayInfo() untuk menambahkan informasi tentang tanggal kedaluwarsa untuk produk makanan.
#### Kelas KeranjangBelanja (Keranjang Belanja)
#### Atribut:
- produkList (List of Produk): Daftar yang menampung produk yang ditambahkan ke keranjang.
#### Metode:
- tambahProduk(Produk, int): Menambahkan produk ke keranjang jika stok mencukupi.
- hitungTotalBelanja(): Menghitung total harga semua produk dalam keranjang.
- displayKeranjang(): Menampilkan semua item di dalam keranjang dan total biaya.
