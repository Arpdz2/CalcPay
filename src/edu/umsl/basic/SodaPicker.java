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
public class SodaPicker 
{
    public static void main(String args[])
    {
        System.out.println("What is your favorite soda pop");
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        
        if(input.equalsIgnoreCase("Coke"));
        {
            System.out.println("Have a coke and smile");
        }
    }
}
