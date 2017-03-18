/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shani
 */

import java.util.*;
public class FinalName {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String Fname,Lname,Finalname;
    Random r = new Random();
    System.out.println("Eneter First name:");
    Fname = scan.next();
    System.out.println("Eneter last name:");
    Lname = scan.next();
    while(Lname.length()<5)
    {
       System.out.println("Last name at least 5 letter long::");
       Fname = scan.next(); 
    }
    scan.close();
    Finalname = Fname.substring(0, 1) + Lname.substring(0, 5);
    System.out.println("Final name is:"+ Finalname);
}
}
