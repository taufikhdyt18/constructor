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