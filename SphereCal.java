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
public class SphereCal {
    public static void main(String[] args)
    {
        double radius,area, volume;
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter Radius:");
        radius = scan.nextDouble();
        volume = 4/3 * Math.PI*Math.pow(radius, 3);
        area   = 4/3 * Math.PI*Math.pow(radius, 2);
        System.out.print("Area is      :");
        System.out.print("Volume is    :");
    }
}
