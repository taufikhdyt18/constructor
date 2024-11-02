public class Main {
    public static void main(String[] args) {
        // Creating Manager object
        Manager man1 = new Manager("Budi", 10000000, 2000000);
        
        // Creating Programmer objects with different constructors
        Programmer prog1 = new Programmer("Andi Herlambang");
        Programmer prog2 = new Programmer("Riko", 6000000);
        Programmer prog3 = new Programmer("Dina", 5000000, 3000000);

        // Displaying info for Manager
        System.out.println("Manager Info:");
        man1.cetakInfo();
        System.out.println();

        // Displaying info for each Programmer object
        System.out.println("Programmer Info:");
        prog1.cetakInfo();
        System.out.println();
        prog2.cetakInfo();
        System.out.println();
        prog3.cetakInfo();
    }
}