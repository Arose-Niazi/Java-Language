package LAB;

public class Employee {
    private String name;
    private int age;
    private int empID;

    public Employee(String name, int age, int empID) {
        this.name = name;
        this.age = age;
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", empID=" + empID +
                '}';
    }

    public double earnings() {return 0.0;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
