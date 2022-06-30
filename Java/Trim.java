 class Trim {
     String trim(String A) {
       int start=0;
      int end=0;
      boolean charCheck=false;
      boolean startCheck=true;
      for(int i=0;i<A.length();i++){
          if(startCheck && (int)A.charAt(i)>=97 && (int)A.charAt(i)<=122){
              start=i;
              startCheck=false;
              end=i;
              charCheck=true;
          }
          if((int)A.charAt(i)>=97 && (int)A.charAt(i)<=122){
              end=i;
              charCheck=true;
          }
      }
       if(!charCheck){
           return "";
       }
      return A.substring(start,end+1);
    }
}
class TrimMain{
    public static void main(String args[]){
        Trim obj=new Trim();
        String res=obj.trim("***");
        System.out.println(res);
    }
}