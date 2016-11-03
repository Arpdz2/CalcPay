/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin Paul
 */

package edu.umsl;
import java.text.NumberFormat;
import java.util.Locale;
import java.io.*;

public class EmployeeTime
{
   
   public void calcPay() throws IOException
   {
       int totalhours;
       int hours = 40;
       int othours;
       int wagerate = 10;
       float otrate = 1.5f;
       float totalpay;
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Please enter your total hours worked: ");
       totalhours = Integer.parseInt(br.readLine());
       
       othours = totalhours - hours;
       hours = totalhours - othours;
       totalpay  = (hours * wagerate) + (othours * wagerate * otrate);
       System.out.println(totalpay);
       

       NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.GERMANY);
       System.out.println(fmt.format(totalpay));
        //NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(fmt.format(totalpay));
   }
    
        
}