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
public class RandomIntGenerator {
  public static void main(String[] args)
  {
      Random rand = new Random();
      int num = rand.nextInt(21) + 20; // 20 to 40, inclusive
      System.out.println("Number Generated is:"+num); 
      System.out.println("Sine: " + Math.sin(num)); 
      System.out.println("Cosine: " + Math.cos(num));
      System.out.println("Tangent: " + Math.tan(num));
  }
}
