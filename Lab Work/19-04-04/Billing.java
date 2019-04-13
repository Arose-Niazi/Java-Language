public class Billing {
    private int billID;
    private Doctor docInfo;
    private Patient pInfo;
    private double testFee;

    public Billing(int billID, Doctor docInfo, Patient pInfo) {
        this.billID = billID;
        this.docInfo = docInfo;
        this.pInfo = pInfo;
        testFee = 500.0;
    }

    @Override
    public String toString() {
        return "---> Billing{" +
                "billID=" + billID +
                ", docInfo=" + docInfo +
                ", pInfo=" + pInfo +
                ", testFee=" + testFee +
                '}';
    }

    public  double getPaymentAmount() {
        return testFee;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Doctor getDocInfo() {
        return docInfo;
    }

    public void setDocInfo(Doctor docInfo) {
        this.docInfo = docInfo;
    }

    public Patient getpInfo() {
        return pInfo;
    }

    public void setpInfo(Patient pInfo) {
        this.pInfo = pInfo;
    }

    public void setTestFee(double testFee) {
        this.testFee = testFee;
    }
}
