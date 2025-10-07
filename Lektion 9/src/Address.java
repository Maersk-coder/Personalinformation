public class Address {
    private String street;
    private String city;

    // Constructor - sætter gade og by
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Copy constructor - laver en kopi af en anden Address
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
    }

    // Copy metode - returnerer en ny kopi af Address
    public Address copy() {
        return new Address(this);
    }

    // toString til pæn udskrift

    public String toString() {
        return street + ", " + city;
    }
}
