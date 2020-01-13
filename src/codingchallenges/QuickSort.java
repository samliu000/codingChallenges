/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codingchallenges;
import java.util.*;
/**
 *This class will have a method that when used, uses quick sort on an array
 * @author samuelliu
 */
public class QuickSort {
    
    public static void printArray(int arr[])
    {
        int n = arr.length; 
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    /*The main function that implements QuickSort()
        array[]-->Array to be sorted,
        low --> Starting index,
        high --> Ending index
    */
    public static void quickSort(int array[], int low, int high){
        if(low<high){
            int pi = new QuickSort().partition(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        while(k>0){
            int n = kb.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = kb.nextInt();
            }
            quickSort(arr, 0, n-1);
            printArray(arr);
            k--;
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j = low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high]; 
        arr[high]= temp; 
        return(i+1);
    }
}
