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
public class BarChart
{
    public static void main(String[] args) 
    {
          Scanner makeNewScanner = new Scanner(System.in);
          
          System.out.print("\nEnter today's sales for store 1: ");
          double storeOneSales = makeNewScanner.nextDouble();
          
          System.out.print("\nEnter today's sales for store 2: ");
          double storeTwoSales = makeNewScanner.nextDouble();
          
          System.out.print("\nEnter today's sales for store 3: ");
          double storeThreeSales = makeNewScanner.nextDouble();
          
          System.out.print("\nEnter today's sales for store 4: ");
          double storeFourSales = makeNewScanner.nextDouble();
          
          System.out.print("\nEnter today's sales for store 5: ");
          double storeFiveSales = makeNewScanner.nextDouble();
          
          double storeOneBar = (storeOneSales)/100;
          double storeTwoBar = (storeTwoSales)/100;
          double storeThreeBar = (storeThreeSales)/100;
          double storeFourBar = (storeFourSales)/100;
          double storeFiveBar = (storeFiveSales)/100;
          
          System.out.print("SALES BAR CHART");
          
          System.out.print("\nStore 1: ");
          while (storeOneBar>1)
          {
              System.out.print("*");
              storeOneBar--;
          }
          
          System.out.print("\nStore 2: ");
          while (storeTwoBar>1)
          {
              System.out.print("*");
              storeTwoBar--;
          }
          
          System.out.print("\nStore 3: ");
          while (storeThreeBar>1)
          {
              System.out.print("*");
              storeThreeBar--;
          }
          
          System.out.print("\nStore 4: ");
          while (storeFourBar>1)
          {
              System.out.print("*");
              storeFourBar--;
          }
          
          System.out.print("\nStore 5: ");
          while (storeFiveBar>1)
          {
              System.out.print("*");
              storeFiveBar--;
          }
    }
}
