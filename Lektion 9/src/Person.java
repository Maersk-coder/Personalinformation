public class Person {
    private String name;
    private MyDate birthday;
    private Address address; // NY variabel

    // Constructor
    public Person(String name, MyDate birthday, Address address) {
        this.name = name;
        this.birthday = birthday.copy();  // kopi af datoen
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.birthday = other.birthday.copy(); // ny kopi af dato
        this.address = other.address.copy();   // ny kopi af adresse
    }

    // Copy metode
    public Person copy() {
        return new Person(this); // bruger copy constructor
    }


    // Getter for navn
    public String getName() {
        return name;
    }

    // Getter for fødselsdag (kopi returneres for at undgå at ændre direkte)
    public MyDate getBirthday() {
        return birthday.copy();
    }

    // Getter for adresse (kopi returneres)
    public Address getAddress() {
        return address.copy();
    }

    // toString - nu også med adresse
    public String toString() {
        return "Navn: " + name + ", Fødselsdag: " + birthday + ", Adresse: " + address;
    }
}
