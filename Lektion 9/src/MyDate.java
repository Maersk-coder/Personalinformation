public class MyDate {
    // Felter (dag, måned, år)
    private int day;
    private int month;
    private int year;

    // Tom constructor
    public MyDate() {
    }

    // Constructor med parametre
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Copy constructor (Exercise 8.01c)
    public MyDate(MyDate obj) {
        this.day = obj.day;
        this.month = obj.month;
        this.year = obj.year;
    }

    // Setter og getter for dag
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    // Setter og getter for måned
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Setter og getter for år
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Viser dato som tekst
    public String displayDate() {
        return day + "/" + month + "/" + year;
    }

    // -------- Exercise 8.01a: equals metode --------
    public boolean equals(MyDate obj) {
        return this.day == obj.day && this.month == obj.month && this.year == obj.year;
    }

    // -------- Exercise 8.01b: copy metode --------
    public MyDate copy() {
        return new MyDate(this.day, this.month, this.year);
    }

    // -------- Exercise 8.02: nextDays metode --------
    // Øger datoen med et antal dage (meget simpel udgave, uden hensyn til månedslængder)
    public void nextDays(int days) {
        // Tilføjer antal dage til feltet "day"
        this.day += days;

        // Meget enkel logik: hvis dag > 30, så rykker vi til næste måned
        // (ikke helt korrekt ift. rigtige måneder, men god nok til øvelsen)
        while (this.day > 30) { // så længe dag er større end 30
            this.day -= 30;    // træk 30 fra dag
            this.month++;      // gå en måned frem
            if (this.month > 12) { // hvis måneden bliver for stor
                this.month = 1;   // start forfra ved januar
                this.year++;      // gå et år frem
            }
        }
    }

    // -------- Exercise 8.04: isBefore metode --------
    // Tjekker om denne dato er før en anden dato
    public boolean isBefore(MyDate other) {
        if (this.year < other.year) {
            return true;
        } else if (this.year == other.year && this.month < other.month) {
            return true;
        } else if (this.year == other.year && this.month == other.month && this.day < other.day) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
