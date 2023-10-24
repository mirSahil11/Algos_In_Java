/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fazil
 */
public class MatrixAdditionExample {
    public static void main(String args[]){
        //creating two matricies
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
       
        //creatinng another matrix to store the sum of two matrices 
        int c[][]=new int[3][3];  //three rows and three columns
        
        //adding and printing addition of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];   //use - for subtraction
                System.out.println(c[i][j]+" ");
                }
            System.out.println();    //new line
        }
     }
   }
