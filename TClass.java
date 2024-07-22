import java.util.*;

class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public void show() {
        System.out.print(name + " ");
    }
}

// Define class Employee
class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void show() {
        super.show();
        System.out.print(salary + " ");
    }
}

// Define class Student
class Student extends Person {
    int semester;

    public Student(String name, int sem) {
        super(name);
        this.semester = sem;
    }

    public void show() {
        super.show();
        System.out.print(semester + " ");
    }

}

public class TClass {
    // Define method printAll
    public static void printAll(List<? extends Person> l) {
        for (Person p : l) {
            p.show();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> lp = new ArrayList<Person>();
        List<Employee> le = new ArrayList<Employee>();
        List<Student> ls = new ArrayList<Student>();

        int n = sc.nextInt(); // number of inputs
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(); // type of person
            String s1 = sc.next(); // name
            if (t == 2) {
                double s2 = sc.nextDouble(); // salary
                le.add(new Employee(s1, s2));
            } else if (t == 3) {
                int s3 = sc.nextInt(); // semester
                ls.add(new Student(s1, s3));
            } else {
                lp.add(new Person(s1));
            }
        }

        printAll(lp);
        System.out.println();
        printAll(le);
        System.out.println();
        printAll(ls);
        sc.close();
    }
}
