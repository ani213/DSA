class Solution {
     int solve(int[] A) {
        int first=A[0];
        int second=A[1];
        for(int i=0;i<A.length;i++){
           if(A[i]>first){
               first=A[i];
           }if(A[i]>second && A[i]<first){
               System.out.println(A[i]);
               second=A[i];
           }
        }
        System.out.println(second);
        return first;
    }
}
class SecondLarg{
    public static void main(String args[]){
        int arr[]={7,10,90,8,110};
        Solution obj=new Solution();
       int second= obj.solve(arr);
        System.out.println(second);
    }
}