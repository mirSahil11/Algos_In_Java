

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fazil
 */
import java.util.Random;
public class RandomElementPicker {
 public static void main(String[] args){
     String[]myArray={"apple","banana","cherry","date","elderberry","fig","grape"};
     //Picking a random element from the array
Random random = new Random();
String randomElement = myArray[random.nextInt(myArray.length)];
System.out.println(randomElement);

}    
}
