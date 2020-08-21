import java.util.Arrays;
import java.lang.Math;
public class QuicksortAlg{



    public static void main(String  [] args){

        int[] a = random1DArray();
        long start = System.nanoTime();
        System.out.println(Arrays.toString(a));
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
        long end = System.nanoTime();
        long duration = (end-start)/1000;   
        System.out.print("total time taken: " + duration + " milliseconds.");
    }

    public static void quicksort(int[] p, int low, int high )
    { 
        if (low < high) //all arrays passed in with a length greater than 1 will have a high > low
        { 
        
            int pi = partition(p, low, high);  // new partition for any subarray greater than 1
            quicksort(p, low, pi-1); //recursively send the left subtree
            quicksort(p, pi+1, high); // recursively send the right subtree
        } 
    } 

    public static int partition( int[] arr, int low, int high){ 
            int pivot = arr[high];  
            int i = (low-1); // index of smaller element 
            for (int j=low; j<high; j++) { 
                // If current element is smaller than the pivot 
                if (arr[j] < pivot) { 
                    i++;
                    swap(arr, i, j);
                    System.out.println("swapped " + arr[i] + " for " + arr[j]);
                } 
            } 
                swap(arr, i+1, high);
                System.out.println("swapped " + arr[i+1] + " for " + arr[high]);

            return i+1; 
        } 

        public static void swap(int[] i, int val1, int val2){
            int temp = i[val1];
            i[val1] = i[val2];
            i[val2] = temp;
        }

        public static int[] random1DArray(){
            int length =  (int)(Math.random() * 25) + 1;
            int [] arr = new int [length];
            for(int i = 0; i < length; i++){
                arr[i] = (int)(Math.random() * 100) + 1;
            }
            return arr;
        }
}
