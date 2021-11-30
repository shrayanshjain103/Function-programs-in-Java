package com.shrayansh;

import java.util.Scanner;

public class Circumfrance_Area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r=in.nextFloat();
        circumfrance_Area(r);
    }
    static void circumfrance_Area(float a){
        float circumfrance=(float)(2*Math.PI*a);
        float area= (float)(Math.PI*a*a);
        System.out.println("The Circumfrance of circle: "+circumfrance);
        System.out.println("The Area of circle is: "+area);
    }
}
