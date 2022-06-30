import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner sc=new Scanner(System.in);
         long n=sc.nextLong();
            // System.out.println((int)n);

        long sum=0;
        long count=0;
        while(n>0){
            long digit=n%10;
            long res=0;
            if(digit!=0){
             res=(long)Math.pow(2,count);
            }else{
                res=0;
            }
            sum=sum+digit*res;
            n=n/10;
            count++;
        }
            System.out.println(sum);
    }
}