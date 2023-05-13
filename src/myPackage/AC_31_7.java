package myPackage;
import java.util.*;

public class AC_31_7 {
    public static void main(String[] args) {
        // Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(1);
        qu.add(2);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}
