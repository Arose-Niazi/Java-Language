public class GPhysician extends Doctor {
    public GPhysician(int age, String name, String NIC, int docID, String docQ, double docSal) {
        super(age, name, NIC, docID, docQ, docSal);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tGPhysician";
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount();
    }
}
