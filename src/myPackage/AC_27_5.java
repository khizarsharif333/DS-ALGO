// Linked list using collection frame work
package myPackage;
import java.util.LinkedList;

public class AC_27_5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("Buy");
        list.addLast("pen");
        System.out.println(list);
        System.out.println(list.size());
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.addLast("a");
        System.out.println(list);
        list.addLast("a");
        //list.removeLast();
        //System.out.println(list);
        //list.remove(0);
        //System.out.println(list);
        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.get(1));
    }
}
