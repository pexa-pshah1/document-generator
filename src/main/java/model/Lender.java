package model;

public class Lender {
    String companyName;
    String address;
    String regNumber;

    public Lender(String companyName, String address, String regNumber) {
        this.companyName = companyName;
        this.address = address;
        this.regNumber = regNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
