/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee {

    // instance variables
    int id;
    String name;
    double salary;

    // define the no-arg constructor here 
    //  (Set name to "-----", id to 0, salary to 0)


    // define the constructor with arguments here


    // define the toString method here


    // define the equals method here


    // define the compareTo method here 
    //    (compare by their names, use the String's compareTo method
    //     to compare just the names of both employees)
    //   then at the bottom of main write a conditional that uses it
    //   DON'T FORGET TO ADD 'implements Comparable<Employee>' TO CLASS SIGNATURE


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Employee undefined = new Employee();
        Employee boss = new Employee("Sax Winderhaven", 12345, 55000);
        Employee newGuy = new Employee("Jasper John", 44444, 41000);
        Employee undefined2 = new Employee();

        System.out.print("Employee undefined = ");
        printEmployee(undefined);
        System.out.print("Employee boss = ");
        printEmployee(boss);
        System.out.print("Employee newGuy = ");
        printEmployee(newGuy);

        if (sameEmployee(boss, newGuy)) {
            System.out.println("boss and newGuy contain the same info");
        }
        if (sameEmployee(undefined, undefined2)) {
            System.out.println("boss and newGuy contain the same info");
        }

        // write a conditional expression to determine which employee, 
        //  boss or newGuy comes first in the directory

//         if (                    )
//             System.out.println("newGuy comes first in the directory");
//         else
//             System.out.println("boss comes first in the directory");

    }
}
