import java.lang.Math;
import java.util.*;
class LCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=Math.max(a,b);
        for(int i=max;i<=999999999;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}