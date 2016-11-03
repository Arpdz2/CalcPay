/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl;

import java.io.IOException;

/**
 *
 * @author Austin Paul
 */
public class RunEmployeeTime 
{
     public static void main(String args[]) throws IOException
     {
         EmployeeTime et1 = new EmployeeTime();
         et1.calcPay();
     }
}
