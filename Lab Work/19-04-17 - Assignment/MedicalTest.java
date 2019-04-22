public class MedicalTest {
    private int testID;
    private String testName;
    private double testFee;

    public MedicalTest(int testID, String testName, double testFee) {
        this.testID = testID;
        this.testName = testName;
        this.testFee = testFee;
    }

    @Override
    public String toString() {
        return String.format("%-10.10s%40.40s%-10.10s\n",testName," ",Integer.toString((int) testFee));
    }

    public double getTestFee() {
        return testFee;
    }
}