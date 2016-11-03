/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.basic;
import java.util.*;
/**
 *
 * @author arpdz2
 */
public class myDoWhileLoop 
{
    
    public static void main(String[] args)
    {
        myDoWhileLoop mdwl = new myDoWhileLoop();
        mdwl.average();
    }    
    
    
    public void average()
    {   
     int num = 0, count = 0, total = 0;
     Scanner sc = new Scanner(System.in);
     do {
          System.out.print("Enter a whole number, and -99 to quit: ");
          num = sc.nextInt(); // accept input
          if (num != -99)
          {
          count++; // increment counter 
          total += num; //accumulate the sum 
          }
         
        } while (num != -99); // test the condition
     float average = (float) total/count;
     System.out.println("You keyed in " + new Integer(count) + " numbers \n");
     System.out.println("The average  is: " + new Float(average));
     
    }
}
