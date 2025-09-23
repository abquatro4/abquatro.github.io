
import java.util.Arrays;

//Creator Albert.

//for CTE software development 1

//instructor Mr Gross

public class bubble{

public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

    int temp;

        temp=arrayToSwap[lowerIndex];

        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

        arrayToSwap[lowerIndex+1]=temp;

        return arrayToSwap;

}

public static void main(String[] args){
    
int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
    // Prints the unsorted array.
    System.out.println("Unsorted array " + Arrays.toString(arrayToSort));
    //sets isSorted to false.
    boolean isSorted = false;
    int unsortedlength = arrayToSort.length - 1; //Sets unsortedlength to the length of the array -1.
    //Runs while isSorted is false. Runs until all of the numbers are swapped into the correct order.
    while (!isSorted) {
        isSorted = true;
       //Introduces the variable x into the loop.
        for (int x = 0; x < unsortedlength; x++) {
            
            if (arrayToSort[x] < arrayToSort[x + 1]) { //If the number is smaller than the next it preforms the swap
                arrayToSort=swapTwoArrayElements(arrayToSort, x); //Swaps the two numbers.
                isSorted = false;
            }
        }
    }
 System.out.println("Sorted array " + Arrays.toString(arrayToSort));
}
}












