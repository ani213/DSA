import java.lang.*;
import java.util.*;

class PerfectSqure {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         IsPerfectSqure obj=new IsPerfectSqure();
         System.out.println(obj.isPerfectSqure(n));
}
}
class IsPerfectSqure{
    int isPerfectSqure(int A){
         int upper=A;
        int lower=A/2;
        while((long)lower*lower>=(long)A){
            upper=lower;
            lower=lower/2;
        }
        // System.out.println(lower+" "+upper);
        for(int i=lower;i<=upper && (long)i*i<=(long)A;i++){
            // System.out.println(i*i);
                if((long)i*i==(long)A){
                    return (int)i;
                }
        }
        return -1;
    }
}