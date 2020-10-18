/*
Fisher-yates Alg is a linear shuffling algorithm. It will take values and swap them given a random value(max n-i) with n being the number of possible indexes and i being the iterating index. 
*/

import java.util.Arrays;
import java.util.Scanner;
public class Fisher_yates{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in the size of the array that you want to shuffle using Fisher-yates alg \n");
        int size = scan.nextInt();
        int[] array = inOrderArr(size);
        System.out.println("Your array before shuffling is: " + Arrays.toString(array));
        fisher_yates(array);
        System.out.println("Your array after shuffling is: " + Arrays.toString(array));
    }


    public static int[] inOrderArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        return arr;
    } 

    public static void fisher_yates(int[] arr){
        /* the other way of doing this is to use the Random class which has a nice .nextInt() method. 
        Random rand = new Random();
        /  j = rand.nextInt(i+1);
        */
        int j = 0;
        for(int i = arr.length-1; i>=0; i--){
            j = (int) (Math.random() * (i-1));
            swap(arr, i, j);
        }
    }

    public static void swap( int [] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    
}