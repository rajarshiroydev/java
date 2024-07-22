import java.util.*;

// Define interface Appraisable
public interface Appraisable() {

    
}

// Define interface SpecialAppraisable
public class Mock1_3 implements SpecialAppraisable {
    private String name;
    private double salary;
    private double stuPassPer;

    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getstuPassPer() {
        return stuPassPer;
    }

    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }

    public void checkAndUpdateSalary() {
        if(stuPassPer >= 60 && stuPassPer < 75)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher tArr[] = new Teacher[3];
        for (int i = 0; i < tArr.length; i++)
            tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
        InterfaceTest.printUpdatedTeachList(tArr);
    }
}