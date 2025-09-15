// Code creator: Albert.
// Code use: Gives the answer to whether number is odd or even up to 100.
public class array {
    public static void main(String[] args) {
       //Starting value.
       int x = 0;
        //intial number at which the sum starts
        int sum = 0;
        //While it equals less than one hundred the code will keep running until it equals one hundred.
        int arr[] = new int[100];
         for (int u : arr) {
            u = x;
                //This is what adds one each time the loop runs.
            x++;
            int inputnumber = x;
            if(inputnumber%2 == 0){
            System.out.println(x + " is an even number");
            
            }else {
            System.out.println(x + " is an odd number");
          }
        //Adds x to the sum each time the loop runs
        sum = sum + x;
       
        }
         {

        }
        //Prints the final sum of all loop iterations.
        System.out.println("Sum is " + sum);
    }

}