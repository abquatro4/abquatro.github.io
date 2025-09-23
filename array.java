// Code creator: Albert.
// Code use: Gives the answer to whether number is odd or even up to 100.
public class array {

    public static void main(String[] args) {
        //Starting value.

        //intial number at which the sum starts
        int sum = 0;
        //While it equals less than one hundred the code will keep running until it equals one hundred.
        int arr[] = new int[100];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = x + 1;
        }

        //While x is less than the array length it runs the loop.
        for (int x = 0; x < arr.length; x++) {
            //This is what tells the code that inputnumber is the array.
            int inputnumber = arr[x];
            //this is what shows whether or not the number is even.
            if (inputnumber % 2 == 0) {
                System.out.println(inputnumber + " is an even number");

            } else {
                System.out.println(inputnumber + " is an odd number");
            }
            sum = sum + inputnumber;
            

        }
        {

        }
        //Prints the final sum of all loop iterations.
        System.out.println("Sum is " + sum);
    }

}
