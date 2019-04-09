package lab2;

public class Doctor extends Person {
     private int docID;
     private String docQ;
     private double docSal;

    public Doctor(int age, String name, String NIC, int docID, String docQ, double docSal) {
        super(age, name, NIC);
        this.docID = docID;
        this.docQ = docQ;
        this.docSal = docSal;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tDoctor{" +
                "docID=" + docID +
                ", docQ='" + docQ + '\'' +
                ", docSal=" + docSal +
                '}';
    }

    public  double getPaymentAmount() {
        return docSal;
    }
}
