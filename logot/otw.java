public class pa3{
  public static void main(String[] args){
  int[] ar=new int[(int)(Math.random()*15+10)];
  int b=1;
  for(int i=0;i<ar.length;i++){
    ar[i]=(int)(Math.random()*10);
    System.out.print(ar[i]);
    if(ar[i]==0){
      if(ar[ar.length-b]==0){
        b++;
      }
      else{
      while (ar[ar.length-b]!=0){
      int cm=ar.length-b;
      ar[ar.length-b]=ar[i];
      ar[i]=ar[cm];
      b++;
    }
    }
   }
 }
  for(int i=0;i<ar.length;i++){
  System.out.print(ar[i]);
 }
  }
}
