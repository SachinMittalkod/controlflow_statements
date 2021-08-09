class PrimeNumber{
public static void main(String args[]){
   
    for(int i=0;i<=50;i++){
         boolean flag=true;
        for(int j=1;j<i-1;j++){
          if(i%j==0){
         flag=false;
        break;
        }
        }
     if( flag==true){
          System.out.println(i);
          }
}
}
}




