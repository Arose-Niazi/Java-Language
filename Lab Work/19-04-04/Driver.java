package lab2;

public class Driver {
    public static void main(String args[])
    {
        Billing a = new Billing(1, new Surgeon(35, "Ali", "61101-3894355-9", 500, "Dental", 100000, "Molars", 200000), new Patient(7,"Mufti","61101-3894355-8",10001,"Normal","Molar Infection"));
        Billing b = new Billing(1, new GPhysician(44, "Hamza", "61101-3894355-7", 501, "MBBS", 50000), new Patient(17,"Qasim","61101-3894355-5",10051,"Emergency","Leg Freeze"));

        System.out.println(a);
        System.out.println(b);
    }
}
