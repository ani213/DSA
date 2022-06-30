import java.util.*;
class HashMapQuestion{
    public static void main(String args[]){
        int ar[]={3,3,4,5,5,4,4,1};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
             map.put(ar[i],map.get(ar[i])+1);
            }else{
             map.put(ar[i],1);
            }
        }
         for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
    }
}