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
public class SumOfCubes {
    public static void main(String[] args) 
    {
        int num1, num2;
        double SumOfCube;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second Number:");
        num2 = scan.nextInt();
        SumOfCube = Math.pow(num1, 3) + Math.pow(num2, 3);
        System.out.print("sum of cubes is::     " + SumOfCube);
        }    
}
