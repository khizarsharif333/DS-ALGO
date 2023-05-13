// Java Code to Count Possible Decoding Of A Given Digit Sequence
package Prepintsa;

public class code18 {
    static int decode(char[] dig){
        int n = dig.length;
        int[] cnt = new int[n+1];
        cnt[0]=1;
        cnt[1]=1;
        for(int i=2;i<=n;i++){
            cnt[i]=0;
            cnt[i]=cnt[i-1];
            if(dig[i-2]=='1' || dig[i-2]=='2' && dig[i-1]<'7'){
                cnt[i]+=cnt[i-2];
            }
        }
        return cnt[n];
    }
    public static void main(String[] args) {
        String str = "1123";
        char[] dig = str.toCharArray();
        System.out.println(decode(dig));
    }
}
