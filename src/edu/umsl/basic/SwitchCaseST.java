/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl.basic;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Austin Paul
 */
public class SwitchCaseST 
{
    public static void main(String args[]) throws IOException
    {
        int telephone;
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the telephone extension numbers: ");
    String line = br.readLine();
    
    StringTokenizer st = new StringTokenizer(line);
    
    
    while (st.hasMoreTokens())
    {
                
         telephone = Integer.parseInt(st.nextToken());   
  
    
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
    
    
    
    
    
}
