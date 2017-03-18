/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shani
 */
public class BoxTest {
    public static void main(String[] args)
    {
        Box b1 = new Box(0.0,0.0,0.0,false);
        Box b2 = new Box(0.1,0.2,0.3,true);   
        b1.setDepth(2.3);
        b1.setHeigth(3.4);
        b1.setWidth(4.5);
        b1.setFull (true);
        System.out.println(b1);
        //System.out.println("Depth is:"+b1.getDepth());
        //System.out.println("Height is:"+b1.getHeigth());
         //System.out.println("width is:"+b1.getWidth());
    }
    
}
