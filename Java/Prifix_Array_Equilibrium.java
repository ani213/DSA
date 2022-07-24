 import java.util.*;
 class Solution {
    public int solve(int[] A) {
        
        int index=-1;
        for(int i=1;i<A.length;i++){
             A[i]=A[i-1]+A[i];
        }
         for(int i=0;i<A.length;i++){
             if(i==0){
                 int left=0;
                 int right=A[A.length-1]-A[0];
                 if(left==right){
                     index=i;
                     break;
                 }
             }
             else if(i==A.length-1){
                 int left=A[A.length-2];
                 int right=0;
                 if(left==right){
                     index=i;
                     break;
                 }
             }else{
                 int left=A[i-1];
                 int right=A[A.length-1]-A[i];
                 if(left==right){
                    index=i;
                    break;
                 }
             }
                 
        }
        return index;
    }
   
}
class Prifix_Array_Equilibrium_main{
    public static void main(String args[]){
        int[] arr={-7, 1, 5, 2, -4, 3, 0};
        Solution obj=new Solution();
       int x= obj.solve(arr);
       System.out.println(x);
    }
}