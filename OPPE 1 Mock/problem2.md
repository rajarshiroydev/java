Write the Java code as instructed.
• Class Faculty has the following members.

- String name, double salary as private instance variables
- Constructor to initialize the instance variables
- Method public double bonus (float percent) that returns the bonus computed as (percent/100.0)\*salary
- You should define method getDetails () to display name and salary of an
  Faculty
- You should overload method getDetails () as getDetails (float percent)
  to display the name, salary and bonus of an Faculty
  • Class Hod extends class Faculty and has the following members.
- String personalAssistant as private instance variable
- Constructor to initialize the instance variables of Hod that includes the instance variables of Faculty
- You should override method public double bonus (float percent) that returns the bonus of a Hod as 50 percent less bonus than a regular faculty
- You should override method getDetails () to display the name, salary and personalAssistant of Hod.
- You should override method getDetails (float percent) to display the name, salary, personalAssistant and bonus of a Hod
  • Class InheritanceTest has the main method and the following functionality.
- It creates objects of Faculty and Hod types, and also accepts the required input values.
- Invokes methods getDetails () and getDetails (float percent) on Faculty and Hod objects.

Input
Srihari 50000
Vishnu 80000 laxmi

Output
Srihari, 50000.0
Srihari, 50000.0, bonus = 5000.0
Vishnu, 80000.0, laxmi
Vishnu, 80000.0, laxmi, 4000.0

Input
Mohan 45000
Manoj 78000 dhanush

Output
Mohan, 45000.0
Mohan, 45000.0, bonus = 4500.0
Manoj, 78000.0, dhanush
Manoj, 78000.0, dhanush, 3900.0
