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
public class TriangleCal {
    public static void main(String[] args)
    {
        Random rand = new Random();
       int raduis = rand.nextInt(10) + 1;
       int height = rand.nextInt(10) + 1;
       double area,volume;
       area = 2*Math.PI*raduis*height;
       volume = Math.PI*Math.pow(raduis,2)*height;
       System.out.println("Random Radius is:"+ raduis);
       System.out.println("Random Height is:"+ height);
       System.out.println("Area is:"+ area);
       System.out.println("Volume is:"+ volume);
       
    }
    
}
