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
public class WhatsTheGrade 
{
    
 public static void main(String [] args) 
 {
	int  input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	
        System.out.println("Please enter your numeric grade [-99 to quit]");
	Scanner sc = new Scanner(System.in);
	input = sc.nextInt();

	if(input ==- 99) 
        {
            System.exit(1);
        }

	while(input != -99)
        {

            if(input>=90)
            {
                sumA = sumA + 1;
                System.out.println(input + "      A");
	    }
            else if(input >= 70){
                sumB++;
                System.out.println(new Integer(input) + "      B");
            }
            else if(input >= 50){
                sumC++;
                System.out.println(new Integer(input) + "      C");
            }
            else if(input >= 35){
                sumD++;
                System.out.println(new Integer(input) + "      D");
            }
            else{
                sumF++;
                System.out.println(new Integer(input) + "      F");
            }
            
            System.out.println("Please enter another numeric grade [-99 to quit]");
            input = sc.nextInt();
        }
        
        System.out.println("The total number of A's is " + sumA );
        System.out.println("The total number of B's is " + sumB );
        System.out.println("The total number of C's is " + sumC );
        System.out.println("The total number of D's is " + sumD );
        System.out.println("The total number of F's is " + sumF );
   } 
}

