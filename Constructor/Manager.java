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