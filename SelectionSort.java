/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fazil
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                index=j;   //searching for lowest index
            }
        }
        int smallestNumber =arr[index];
        arr[index]=arr[i];
        arr[i]=smallestNumber;
        } 
    }
public static void main(String a[]){
int[] arr1 = {9,14,3,2,43,11,58,22};
System.out.println("Before Selection Sort");
for(int i:arr1){
    System.out.println(i+" ");
}
System.out.println();
selectionSort(arr1);   //sorting array using selection sort

System.out.println("After Selection Sort");
    for(int i:arr1){
        System.out.println(i+" ");
        
    }
}
}

