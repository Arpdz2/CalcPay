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
public class MySwitchCase 
{
    public static void main(String args[])
    {
    int telephone;
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the telephone extension numbers: ");
    telephone = sc.nextInt();
    
    
    
    
	switch (telephone)
	{
	  case 6279:
	  case 6127:{
			System.out.println("This is on the 2nd floor of CCB");
			break;
		    }
	  case 6520:{
			System.out.println("This is on the 3rd floor of CCB");
			break;
		    }
	  default:  {
			System.out.println("Invalid Telephone Number");
			break; //not required
		    }
	}
	
	
    }
}
