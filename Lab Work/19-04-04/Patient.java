package lab2;

public class Patient extends Person {
    private int pID;
    private String pType;
    private String pDisease;

    public Patient(int age, String name, String NIC, int pID, String pType, String pDisease) {
        super(age, name, NIC);
        this.pID = pID;
        this.pType = pType;
        this.pDisease = pDisease;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tPatient{" +
                "pID=" + pID +
                ", pType='" + pType + '\'' +
                ", pDisease='" + pDisease + '\'' +
                '}';
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpDisease() {
        return pDisease;
    }

    public void setpDisease(String pDisease) {
        this.pDisease = pDisease;
    }
}
