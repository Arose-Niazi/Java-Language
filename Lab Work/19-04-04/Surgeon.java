public class Surgeon extends Doctor {
    private String sSpecialization;
    private double sAllowance;

    public Surgeon(int age, String name, String NIC, int docID, String docQ, double docSal, String sSpecialization, double sAllowance) {
        super(age, name, NIC, docID, docQ, docSal);
        this.sSpecialization = sSpecialization;
        this.sAllowance = sAllowance;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tSurgeon{" +
                "sSpecialization='" + sSpecialization + '\'' +
                ", sAllowance=" + sAllowance +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + sAllowance;
    }

    public String getsSpecialization() {
        return sSpecialization;
    }

    public void setsSpecialization(String sSpecialization) {
        this.sSpecialization = sSpecialization;
    }

    public double getsAllowance() {
        return sAllowance;
    }

    public void setsAllowance(double sAllowance) {
        this.sAllowance = sAllowance;
    }


}
