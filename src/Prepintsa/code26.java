// Finding Roots of a quadratic equation in Java
package Prepintsa;

import java.io.*;
import static java.lang.Math.*;

public class code26 {
    static void quadratic(int a,int b,int c){
        if(a==0){
            System.out.println("Invalid Quadratic equation");
            return;
        }
        int d = (b*b)-(4*a*c);
        double sqrtD = sqrt(abs(d));
        if(d>0){
            System.out.println("Roots are real and different");
            float e = (float)((-b+sqrtD)/2*a);
            float f = (float)((-b-sqrtD)/2*a);
            System.out.println(e+"\n"+f);
            return;
        }
        else if(d==0){
            System.out.println("Roots are same");
            float e = (float)((-b)/2*a);
            System.out.println(e+"\n"+e);
            return;
        }
        else {
            System.out.println("Roots are imaginary");
            float e = (float)((-b)/2*a);
            System.out.println(e+" + i"+sqrtD+"\n"+e+" - i"+sqrtD);
            return;
        }
    }
    public static void main(String[] args) {
        quadratic(3,5,9);
    }
}
