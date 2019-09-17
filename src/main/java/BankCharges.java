
import java.text.DecimalFormat;
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
public class BankCharges 
{
    public static void main(String[] args) 
    {
        float bankFees = 10F;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        Scanner makeNewScanner = new Scanner(System.in);
        int i = 1;
        
        System.out.println("Please enter the ammount of checks for your commercial checking account this month.");
        float totalChecks = makeNewScanner.nextFloat();
        
        while (i <= totalChecks)
        {
              if(i<20)
              {
                  bankFees = bankFees + 0.10F;
                  i++;
              }else if(i>=20&&i<=39)
              {
                  bankFees = bankFees + 0.08F;
                  i++;
              }else if(i>=40&&i<=59)
              {
                  bankFees = bankFees + 0.06F;
                  i++;
              }else if(i>=60)
              {
                  bankFees = bankFees + 0.04F;
                  i++;
              }
        }
        System.out.println("The number of checks for this month are: $" + totalChecks);
        System.out.println("And your service fees for this month are: $" + df.format(bankFees));
    }
    
}
