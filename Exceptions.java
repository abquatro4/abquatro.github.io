//Creator Albert.

//for CTE software development 1

//instructor Mr Gross

public class Exceptions { //Creates a new class
    
    public static void main(String[] args) {
        try {
            System.out.println(5/0); //Tries to print 5 divided by zero.
        }
        catch(ArithmeticException e) { //Catches the expection and prints the user friendly error message.
            System.out.println("Exception: Arithmetic, can't divide by zero!");
            System.out.println("Program closed without crashing!");
        }

        try {
        int array[] = new int[10]; //Makes a new array with a length of 10

        System.out.println(array[10]); //Tries to access line 10 of the array.
        }
        catch(ArrayIndexOutOfBoundsException e) { //Catches the exception and prints the error in simple terms.
            System.out.println("Exception: Array out of Bounds, can't access this part of the array.");
             System.out.println("Program closed without crashing!");
        }
    }
}