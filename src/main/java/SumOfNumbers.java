
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Djon Bon Junzi
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner makeNewScanner = new Scanner(System.in);
        double i = 1;

        System.out.println("Please enter a number");
        double numberOfLoops = makeNewScanner.nextDouble();
        double countingNumber = 0;
        while (i <= numberOfLoops) 
        {
            countingNumber = countingNumber + i;
            i++;
            
        }
        System.out.println("The sum of all the numbers is : " + countingNumber);
    }
}
