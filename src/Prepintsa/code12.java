// Java program to find out the quadrant in which the given co-ordinate lie
package Prepintsa;

public class code12 {
    static void quadrant(int x,int y){
        if(x>0 && y>0) System.out.println("First Quadrant");
        else if(x<0 && y>0) System.out.println("Second Quadrant");
        else if(x<0 && y<0) System.out.println("Third Quadrant");
        else if(x>0 && y<0) System.out.println("Fourth quadrant");
        else if(x==0 && y==0) System.out.println("Origin");
        else if(y==0 && x!=0) System.out.println("X-axis");
        else if(x==0 && y!=0) System.out.println("Y-axis");
        else System.out.println("Invalid credentials");
    }
    public static void main(String[] args) {
        quadrant(-3,-33);
    }
}
