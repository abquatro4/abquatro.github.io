public class Loop {
        public static void main(String[] args)
    {
        //The number starts at zero
        int i = 0;
        //intial number at which the sum starts
        int sum = 0;
        //While it equals less than one hundred the code will keep running until it equals one hundred.
        while (i++ < 100) {
            
            //This is what adds one each time the loop runs.
            //i//++;
            int inputnumber = i;
            if(inputnumber%2 == 0){
            System.out.println(i + " is an even number");
            
            }else {
            System.out.println(i + " is an odd number");
          }
        //Adds i to the sum each time the loop runs
        sum = sum + i;
        
        }
        //Prints the final sum of all loop iterations.
        System.out.println("Sum is " + sum);
    }
}
