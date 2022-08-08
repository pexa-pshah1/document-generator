package model;

import java.util.List;

public class StandardisedMortgageDeed {
    final String deedGoLiveDate;
    final String securityAddress;
    final int tenure;
    final String titleNumber;
    Lender lender;
    final String borrowerName;
    final boolean restrictionRequired;
    final String restrictionText;
    final boolean obligationRequired;
    final String obligationText;
    final boolean additionalProvisionsRequired;
    final String additionalProvisionsText;
    final List<DeedRow> deedRows;

    public StandardisedMortgageDeed(
            String deedGoLiveDate,
            String securityAddress,
            int tenure,
            String titleNumber,
            Lender lender,
            String borrowerName,
            boolean restrictionRequired,
            String restrictionText,
            boolean obligationRequired,
            String obligationText,
            boolean additionalProvisionsRequired,
            String additionalProvisionsText,
            List<DeedRow> deedRows
    ) {
        this.deedGoLiveDate = deedGoLiveDate;
        this.securityAddress = securityAddress;
        this.tenure = tenure;
        this.titleNumber = titleNumber;
        this.lender = lender;
        this.borrowerName = borrowerName;
        this.restrictionRequired = restrictionRequired;
        this.restrictionText = restrictionText;
        this.obligationRequired = obligationRequired;
        this.obligationText = obligationText;
        this.additionalProvisionsRequired = additionalProvisionsRequired;
        this.additionalProvisionsText = additionalProvisionsText;
        this.deedRows = deedRows;
    }

    public String getDeedGoLiveDate() {
        return deedGoLiveDate;
    }

    public String getSecurityAddress() {
        return securityAddress;
    }

    public int getTenure() {
        return tenure;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public Lender getLender() {
        return lender;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public boolean isRestrictionRequired() {
        return restrictionRequired;
    }

    public String getRestrictionText() {
        return restrictionText;
    }

    public boolean isObligationRequired() {
        return obligationRequired;
    }

    public String getObligationText() {
        return obligationText;
    }

    public boolean isAdditionalProvisionsRequired() {
        return additionalProvisionsRequired;
    }

    public String getAdditionalProvisionsText() {
        return additionalProvisionsText;
    }

    public List<DeedRow> getDeedRows() {
        return deedRows;
    }
}
