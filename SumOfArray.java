/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/* Program to find the sum of number of elements
 */
public class SumOfArray{
public static void main(String[] args){

//Intialize array
int[] arr=new int[]{1,2,3,4,5};
int sum=0;

//loop through the array to calculate sum of elements 
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}
System.out.println("sum of all the elements of an array:"+sum);
 }
}
