Employee Project Management

Employee e1 does a set of projects. Employee e2 also does all the projects done by e1 except the first project, in place of which e2 does another project. Write a program that defines two classes Employee and Test. Define a copy constructor to create e2 from e1 in such a way that changing the values of instance variables of either e2 or e1 should not affect the other one. The code takes the name of e2 and a new project done by e2 as input. Complete the program as specified below.
Class Employee

The Employee class has the following members:

    Private instance variables String name and String[] projects to store name and projects respectively.
    Define required constructor(s).
    Accessor methods getName() and getProject(int index) to get the name of the employee and the project at a specific index.
    Mutator methods setName(String name) and setProject(int index, String project) to set the name of the employee and the project at a specific index.

Class Test

The Test class has the main method which does the following:

    Two objects of Employee e1 and e2 are created. e2 is created using e1.
    The name of e2 and the second project done by e2 are updated by taking input.
    The name of e1, e2, and the first project done by e1 and e2 are printed.

Input\
Sneha PJ5

Output\
Surya: PJ1\
Sneha: PJ5

Input\
Rohan PJ7

Output\
Surya: PJ1\
Rohan: PJ7
