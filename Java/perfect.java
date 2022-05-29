import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        for(int k=0;k<a.length;k++){
        int sum=0;
        for(int i=1;i<a[k];i++){
            if(a[k]%i==0){
                sum+=i;
            }
        }
        if(a[k]==sum){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    } 
    }
}