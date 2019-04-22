public class Medicine
{
    private int medID;
    private String medName;
    private int medQty;
    private double medPricePerUnit;

    public Medicine(int medID, String medName, int medQty, double medPricePerUnit) {
        this.medID = medID;
        this.medName = medName;
        this.medQty = medQty;
        this.medPricePerUnit = medPricePerUnit;
    }

    public int getMedQty() {
        return medQty;
    }

    public double getMedPricePerUnit() {
        return medPricePerUnit;
    }

    @Override
    public String toString() {
        return String.format("%-15.15s%5.5s%-10.10s%5.5s%-10.10s%5.5s%-10.10s\n", medName," ",Integer.toString((int)medPricePerUnit)," ",Integer.toString((int)medQty)," ", Integer.toString((int)(medPricePerUnit*medQty)));
    }
}