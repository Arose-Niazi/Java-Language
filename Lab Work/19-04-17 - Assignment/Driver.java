import java.util.ArrayList;

public class Driver {

    public static void main(String args[])
    {
        ArrayList<Medicine> m = new ArrayList<Medicine>();
		ArrayList<MedicalTest> test = new ArrayList<MedicalTest>();
        m.add(new Medicine(1,"Panadol", 2,10));
        m.add(new Medicine(2,"Disprin", 1,20));
        test.add(new MedicalTest(1,"ECG",1000.0));
        test.add(new MedicalTest(2,"ECO", 1000.0));
        Payable p[] = new Payable[2]; 
		p[0] = new Billing(new Doctor("Sarosh", "MBBS", 500), new Patient(1,"Mufti","Dead Brain"), m,test);
		m.remove(1);
		m = new ArrayList<Medicine>();
		test = new ArrayList<MedicalTest>();
		m.add(new Medicine(1,"Panadol", 2,10));
		m.add(new Medicine(3,"Kalarcid", 10,250));
		m.add(new Medicine(4,"Paracetamol", 5,50));
		m.add(new Medicine(5,"Mentos", 20,5));
		
		test.add(new MedicalTest(1,"ECG",1000.0));
        test.add(new MedicalTest(2,"ECO", 1000.0));
		test.add(new MedicalTest(3,"CT-SCAN",15000.0));

		p[1] = new Billing(new Doctor("Ajwa Niazi", "BDS", 4000), new Patient(2,"Arose Niazi","Tottaly Fine"), m,test);
		for(Payable x: p)
			System.out.println(x);
    }
}
