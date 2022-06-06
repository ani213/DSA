import java.lang.*;
import java.util.*;

 class InsertDataInArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size+1];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int position=sc.nextInt();
        int data=sc.nextInt();
        int temp=0;
        boolean checkTemp=false;
        boolean checkData=false;
        for(int i=0;i<=size;i++){
            if(i==position-1){
                temp=arr[i];
                arr[i]=data;
                checkTemp=true;
            }else if(checkTemp){
                data=arr[i];
                arr[i]=temp;
                checkData=true;
                checkTemp=false;
            }else if(checkData){
                temp=arr[i];
                arr[i]=data;
                checkTemp=true;
                checkData=false;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}