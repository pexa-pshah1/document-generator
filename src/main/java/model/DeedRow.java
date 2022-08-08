package model;

public class DeedRow {
    Borrower borrower;
    Witness witness;

    public DeedRow(Borrower borrower, Witness witness) {
        this.borrower = borrower;
        this.witness = witness;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Witness getWitness() {
        return witness;
    }
}
