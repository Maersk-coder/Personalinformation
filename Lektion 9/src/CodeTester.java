public class CodeTester {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(4, 10, 1997); // Her refere jeg til de andre klasser (Address, MyDate og Person)
        Address a1 = new Address("Østergade 12", "Aarhus");

        Person p1 = new Person("Anders", d1, a1);
        Person p2 = p1.copy();

        System.out.println("Før ændringer:");   // Viser jeg, at jeg kan lave kopier, som kan videreføres.
        System.out.println("Original: " + p1);
        System.out.println("Kopi: " + p2);

        // Flytter p1 til en ny adresse
        a1 = new Address("Nørregade 33", "Odense");
        p1 = new Person("Anders", d1, a1); // ny Person med ny adresse

        System.out.println("\nEfter ændringer:");
        System.out.println("Ny adresse " + p1);
        System.out.println("Kopi fra: " + p2);
    }
}
