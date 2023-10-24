/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Program to implement Binary Search Algorithm on an Array to find mid element
 */
public class BinarySearchExample{
public static void binarySearch(int arr[],int first, int last,int key)
{
    int mid=(first+last)/2;
    while(first<=last){
        if (arr[mid]<key)
        {
            first=mid+1;
        }else if(arr[mid]==key){
            System.out.println("Elements is found at index:" + mid);
            break;
            
        
        }else{
            last=mid-1;
        }
        mid=(first + last)/2;
    }
    if(first>last){
        System.out.println("Elements is not found");
        }
}
public static void main(String args[]){
    int arr[]={10,20,30,40,50};
    int key=30;
    int last=arr.length-1;
    binarySearch(arr,0,last,key);
    
    
}
}
