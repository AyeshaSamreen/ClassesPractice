/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shani
 */
import java.util.Random;
import java.util.*;
public class Phone {
    public static void main(String[] args)
    {
   Random generator = new Random();
        int num1, num2, num3;       // Declaration of variables

        num1= generator.nextInt(700) + 100;    // Producing a random number from 100

        System.out.print("Random telephone number: " + num1);

        num2 = generator.nextInt(743);
        if (num2 > 10 && num2 <100)
            System.out.print ("-0" + num2);
        else if (num2 < 10)
                System.out.print ("-00" + num2);
        else System.out.print ("-" + num2);

        num3 = generator.nextInt(10000);
        if (num3 > 100 && num3 <1000)
            System.out.print ("-0" + num3);
            else if (num3 > 10 && num3 <100)
                System.out.print ("-00" + num3);
            else if (num3 < 10)
                    System.out.print ("-000" + num3);
        else 
                System.out.print ("-" + num3); 
}
}