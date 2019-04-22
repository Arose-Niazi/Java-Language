import java.util.ArrayList;

public class Billing implements Payable {
    private int billID;
    private Doctor docInfo;
    private Patient pInfo;
    private ArrayList<Medicine> MedInfo;
    private ArrayList<MedicalTest> Test;
    private static int totalBills;

    static {
        totalBills = 0;
    }

    public Billing(Doctor docInfo, Patient pInfo, ArrayList<Medicine> medInfo, ArrayList<MedicalTest> test) {
        this.docInfo = docInfo;
        this.pInfo = pInfo;
        MedInfo = medInfo;
        Test = test;
        billID = ++totalBills;
    }

    @Override
    public String toString() {
        String s =String.format("\t%30.30s\n%-9.9s%-10.10s%15.15sDoctor Name: %s\n%34.34sPatient Name: %s\n","MedCare Services","Bill ID:",Integer.toString(billID)," ",docInfo," ",pInfo);
		for(int i=0; i<57; i++) s+= "-";
        s += "\n";
        s += String.format("%-15.15s%5.5s%-10.10s%5.5s%-10.10s%5.5s%-10.10s\n","Medicines"," ","Unit Cost"," ","Quantity"," ","Total");
        double bill = 0;
        for(Medicine x : MedInfo) {
            s += x;
            bill+=x.getMedPricePerUnit() * x.getMedQty();
        }
		for(int i=0; i<57; i++) s+= "-";
        s += "\n";
        s += String.format("Meds Total%40.40s%-10.10s\n"," ",Integer.toString((int) bill));
        s += String.format("Doctor Fee%40.40s%-10.10s\n"," ",Integer.toString((int) docInfo.getDocFee()));
		for(int i=0; i<57; i++) s+= "-";
        s += "\n";
        s += String.format("Test Name%41.41sTest Fee\n"," ");
        bill = 0;
        for(MedicalTest x : Test) {
            s += x;
            bill+=x.getTestFee();
        }
        for(int i=0; i<57; i++) s+= "-";
        s += "\n";
        s += String.format("Test Total%40.40s%-10.10s\n"," ",Integer.toString((int) bill));
		for(int i=0; i<57; i++) s+= "-";
        s += "\n";
        s += String.format("Grand Total%39.39s%-10.10s\n"," ",Integer.toString((int) getPaymentAmount()));
        return s;
    }

    public  double getPaymentAmount() {

        double bill = 0;
        for(Medicine x : MedInfo)
        {
            bill+=x.getMedPricePerUnit() * x.getMedQty();
        }
        for(MedicalTest x : Test) {
            bill+=x.getTestFee();
        }
        bill+=docInfo.getDocFee();
        return bill;
    }

}
