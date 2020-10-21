import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Bubble{
    public static void main(String[] args) {
        int [] nums = randArray();
        System.out.println("Original Array: " + Arrays.toString(nums)+"\n");
        bubbleSort(nums);
    }

    public static void bubbleSort( int [] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for( int k = 0; k<nums.length-(i+1); k++){
                    if(nums[k]> nums[k+1]){
                        int temp = nums[k];
                        nums[k] = nums[k+1];
                        nums[k+1] = temp;
                        System.out.println(Arrays.toString(nums));
                        count++;
                    }
            }
        }
        System.err.println("\nYour final array: "+Arrays.toString(nums)+"\nThis array made " + count + " swaps");
    }

    public static int[] randArray(){
        int rand = (int) (5 + Math.random()*25);
        int [] arr = new int[rand];
        Random r = new Random();
        for(int i  = 0; i < arr.length; i++){
            arr[i] = r.nextInt(16);
        }

        return arr;
    }
}