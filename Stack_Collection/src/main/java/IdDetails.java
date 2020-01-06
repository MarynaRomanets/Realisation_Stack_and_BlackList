public class IdDetails {

    private String address;
    private int idNumber;
    private String passportNumber;

    public IdDetails() {
    }

    public IdDetails(String address, int idNumber, String passportNumber) {
        this.address = address;
        this.idNumber = idNumber;
        this.passportNumber = passportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "IdDetails{" +
                "address='" + address + '\'' +
                ", idNumber=" + idNumber +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
