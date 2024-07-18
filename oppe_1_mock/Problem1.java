import java.util.*;

class Employee {
    String name;
    String[] projects;

    // ***** Define constructor(s) here
    // default constructor
    public Employee(String name, String[] projects) {
        this.name = name;
        this.projects = projects;
    }

    // copy constructor
    public Employee(Employee e) {
        this.name = e.name;
        // so that changing the values of instance variables of either e2 or e1 does not
        // change the other
        // if we do this.project = e.projects then both will point to the same array and
        // we if we change something for one instance, it will be changed for both the
        // instances, i.e this.courses will become a reference variable. Hence we
        // created a new array and then inserted the array values from e.
        this.projects = new String[e.projects.length]; // length() is for strings not arrays.
        for (int i = 0; i < projects.length; i++) {
            this.projects[i] = e.projects[i]; // deep copy
        }
    }

    public void setName(String n) {
        name = n;

    }

    public void setProject(int index, String proj) {
        projects[index] = proj;

    }

    public String getName() {
        return name;
    }

    public String getProject(int indx) {
        return projects[indx];
    }

}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] proj = { "PJ1", "PJ2", "PJ3" };
        Employee e1 = new Employee("Surya", proj); // e1=name:Surya,proj= { "PJ1", "PJ2", "PJ3" }
        Employee e2 = new Employee(e1); // e2=name:Surya,proj= { "PJ1", "PJ2", "PJ3" }
        e2.setName(sc.next()); // reading a new name lets say raj, therefore e2=name:raj
        e2.setProject(0, sc.next()); // proj= { "PJ5", "PJ2", "PJ3" }
        System.out.println(e1.getName() + ": " + e1.getProject(0)); // surya, PJ1
        System.out.println(e2.getName() + ": " + e2.getProject(0)); // raj, PJ5
        sc.close();
    }
}