// Maximum number of handshakes in java
package Prepintsa;

public class code14 {
    static int handshakes(int n){
        int count =0;
        for(int i=1;i<n;i++){
            count+=i;
        }
        // count = (n*(n-1))/2;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(handshakes(30));
    }
}
