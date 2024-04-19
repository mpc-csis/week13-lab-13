
/**
 * Write a description of class ArraysOfObjects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysOfObjects {

    public static void main(String[] args) {
        System.out.println("\f");
        problem0();
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
    }

    public static void problem0() {
        System.out.println("-- Problem 0 --------------------");
        /*
         * ======= Problem 0 Before You Begin==========================
         * // Make sure you finish defining and testing the Employee Class
         * // You may want to review the code in Time and Card to help you
         * //------- End Problem 0 ------------------------------------
         */
    }

    public static void problem1() {
        System.out.println("-- Problem 1 --------------------");
        /*
         * ======= Problem 1 Review of Classes and Objects ============
         * //a) Make a variable t, of type Time, set to 11:28:42
         * 
         * 
         * Time.printTime(t); // since we are now outside the Time class, we have to
         * // put Time before printTime which tells Java
         * // what class file the method can be found in
         * 
         * //b) Make a variable p, of type Point, set to (20,30) and print it
         * 
         * //c) Make a variable d, of type Card, set to the Ace of Spaces and print it
         * 
         * //d) Make a variable e, of type Employee, set to ("Jamal", 43434,56400.00)
         * // and print it
         * 
         * //------- End Problem 1 ------------------------------------
         */
    }

    public static void problem2() {
        System.out.println("-- Problem 2 --------------------");
        /*
         * ======= Problem 2 Arrays of Time and String Objects ============
         * //a) Make an array of 5 Time objects called meetingTimes,
         * 
         * //b) assign the following times to cells [0] through [4] of meetingTimes:
         * // 8:30, 10:00, 12:30, 3:00 and 5:15
         * 
         * //c) change the last meeting time to 6:15
         * 
         * 
         * //d) Make an array of 5 String objects called locations and
         * // use an initialization list to store these Strings in the array
         * // "BMC205","BMC207","PS106","GA103","BMC202B"
         * 
         * 
         * //e) Use a for loop to print the times and locations of the meetings
         * // so it says something like:
         * // At 8:30 you have a meeting in BMC205
         * // At 10:00 you have a meeting in BMC207 and so on
         * 
         * 
         * //------- End Problem 2 ------------------------------------
         */
    }

    public static void problem3() {
        System.out.println("-- Problem 3 --------------------");
        /*
         * ======= Problem 3 Arrays of Point Objects ============
         * //a) Make an array of 5 Point objects called star
         * // and set its values equal to the points that define a pentagon shape,
         * // such as (130,250),(200,100),(270,250),(100,150),(300,150),
         * 
         * //b) Define the method printAllPoints where indicated below main
         * // then activate the following statements:
         * 
         * // System.out.println("Here are the points in star:");
         * // printAllPoints(star);
         * 
         * 
         * //c) Define the method translateAll where indicated below main,
         * // then activate the following statements:
         * 
         * // System.out.println("After translating 50,75, here is star:");
         * // translateAll(star,50,75);
         * // printAllPoints(star);
         * 
         * 
         * //------- End Problem 3 ------------------------------------
         */
    }

    public static void problem4() {
        System.out.println("-- Problem 4 --------------------");
        /*
         * ======= Problem 4 Arrays of Employee Objects ============
         * //a) Make an array of 6 Employee objects called startup
         * // and make all its elements refer to default Employee objects
         * 
         * 
         * //b) Define the method printAllEmployees where indicated below main
         * // then activate the following statements:
         * 
         * // System.out.println("Here are the employees at our new startup:");
         * // printAllEmployees(startup);
         * 
         * //c) Set the first three elements to new Employees with fictitious
         * // names, IDs and salarys (like John Pilsner, 1111,35000 ... etc)
         * // and print all the employees again
         * 
         * 
         * //d) If a 5% raise can be given by setting an employees salary *= 1.05,
         * // define the method giveRaiseToAll where indicated below main,
         * // then activate the following statements:
         * 
         * // System.out.println("After giving a 6.5% raise to all workers:");
         * // giveRaiseToAll(startup,6.5);
         * // printAllEmployees(startup);
         * 
         * 
         * //------- End Problem 4 ------------------------------------
         */
    }

    public static void problem5() {
        System.out.println("-- Problem 5 --------------------");
        /*
         * ======= Problem 5 Arrays of Card Objects ============
         * //a) Make an array of 3 Card objects called hand
         * // and set its values equal to the King of Hearts,
         * // Two of Clubs, and Five of Diamonds
         * 
         * 
         * //b) Just write a for loop to print the values of each card object in hand
         * 
         * 
         * //c) Define the method blackJackValue below where indicated
         * // below main, then activate the following statements:
         * 
         * // System.out.println("The value of this hand is " +
         * // blackJackValue(hand) + ", should be 17");
         * 
         * //d) Make another array of 3 Card objects, set to whatever cards you
         * // like, and print the blackJack value of the cards in the array
         * 
         * 
         * 
         * //------- End Problem 5 ------------------------------------
         */
    }

    // 3b) Define method printAllPoints here

    // 3c) Define method translateAll here

    // 4b) Define method printAllEmployees here

    // 4c) Define method giveRaiseToAll here

    // 5c) Define the method blackJackValue here
    // (you may want to first define a blackJackValue method in the Card class
    // and invoke it here in this method, to sum up the blackJackValues of
    // all the cards in the player's hand)
}
