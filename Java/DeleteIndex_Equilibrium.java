import java.util.*;

class DeleteIndex_Equilibrium{
     int solve(int[] A){
        int n=A.length;
        int[] preOdd= new int[n]; 
        int[] preEven=new int[n];
        preOdd[0]=0;
        preEven[0]=A[0];
        int count=0;
        for(int i=1;i<n;i++){
             if(i%2==0){
                 preEven[i]=preEven[i-1]+A[i];
                 preOdd[i]=preOdd[i-1];
             }else{
                 preOdd[i]=preOdd[i-1]+A[i];
                 preEven[i]=preEven[i-1];

             }
        }
         for(int i=0;i<n;i++){
            int sumOdd=0;
            int sumEven=0;
            if(i==0){
                sumOdd=preEven[n-1]-preEven[i];
                sumEven=preOdd[n-1]-preOdd[i];
            }else{
                sumEven=preEven[i-1]+preOdd[n-1]-preOdd[i];
                sumOdd=preOdd[i-1]+preEven[n-1]-preEven[i];
            }
            if(sumEven==sumOdd){
                count++;
            }
         }

         return count;
     }
}
class DeleteIndex_Equilibrium_main{
   public static void main(String args[]){
       int[] a={1,1,1};
      DeleteIndex_Equilibrium obj= new DeleteIndex_Equilibrium();
      int result=obj.solve(a);
      System.out.println(result);
   }
}