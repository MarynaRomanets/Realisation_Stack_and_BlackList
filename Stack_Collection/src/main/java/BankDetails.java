public class BankDetails {

    private String country;
    private long cardNumber;
    private String lastName;
    private String firstName;
    private int year;
    private int pin;

    public BankDetails() {
    }

    public BankDetails(String country, long cardNumber, String lastName, String firstName, int year, int pin) {
        this.country = country;
        this.cardNumber = cardNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.year = year;
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "country='" + country + '\'' +
                ", cardNumber=" + cardNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", year=" + year +
                ", pin=" + pin +
                '}';
    }
}
