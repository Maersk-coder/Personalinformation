public class MyDateTester {
    public static void main(String[] args) {
        // Opretter en ny dato (23/2/2018) og gemmer den i variablen d1
        MyDate d1 = new MyDate(23, 2, 2018);
        System.out.println("Original dato: " + d1);

        // Laver en kopi af d1 ved hjælp af copy constructor (new MyDate(d1))
        // Det betyder at d2 er en ny MyDate med samme dag, måned og år
        MyDate d2 = new MyDate(d1);
        System.out.println("Kopi via constructor: " + d2);

        // Laver en kopi af d1 ved hjælp af copy() metoden
        // copy() bruger internt copy constructor, så resultatet er det samme
        MyDate d3 = d1.copy();
        System.out.println("Kopi via copy(): " + d3);

        // Nu ændrer vi den originale dato (d1) til at have dag = 24
        d1.setDay(24);

        // Udskriver alle for at vise forskellen
        System.out.println("Ændret original: " + d1);
        System.out.println("Constructor kopi: " + d2);
        System.out.println("Copy() kopi: " + d3);

        /*
         * VIGTIGT:
         * - d1 blev ændret til 24/2/2018
         * - d2 og d3 forblev 23/2/2018
         * Det viser at vi har lavet RIGTIGE kopier (nye objekter),
         * og ikke bare en reference til den samme dato.
         */
    }
}
