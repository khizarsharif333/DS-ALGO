package Striver_SDE_Sheet;

public class Code74 {
    // Simple Solution
    /*public static int repeatedStringMatch(String a, String b) {
        if(a.length()==0 || b.length()==0) return -1;
        if(a.compareTo(b)==0) return 1;
        int count = 1;
        String str = a;
        while(str.length()<b.length()){
            count++;
            str = str + a;
        }
        if(str.contains(b)) return count;
        str += a;
        if(str.contains(b)) return ++count;
        return -1;
    }*/
    // Rabin karp Algorithm
    public static boolean check(String source,String target){
        long targetCode = 0L;int m = target.length();
        for(int i=0;i<m;i++) targetCode += (target.charAt(i)*Math.pow(10,m-1-i));
        long sourceCode = 0L;
        int i =0;
        while(i<=source.length()-m){
            if(i==0){
                for(int j=0;j<m;j++){
                    sourceCode += source.charAt(j)*Math.pow(10,m-1-j);
                }
            }
            else{
                sourceCode -= source.charAt(i-1)*Math.pow(10,m-1);
                sourceCode *= 10;
                sourceCode += source.charAt(i+m-1);
            }
            if(sourceCode==targetCode){
                if(source.substring(i,i+m).equals(target)) return true;
            }
            i++;
        }
        return false;
    }
    public static int repeatedStringMatch(String a, String b) {
        if(a.length()==0 || b.length()==0) return -1;
        if(a.equals(b)) return 1;
        int count = 1;
        String str = a;
        while(str.length()<b.length()){
            count++;
            str = str + a;
        }
        if(str.equals(b)) return count;
        else if(check(str,b)) return count;
        else if(check(str+a,b)) return ++count;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("a","aa"));
    }
}
