class AirthmaticOperation{
 
   int add(int a ,int b){
   int addResult=a+b;
   return addResult;
   }
  int sub(int a ,int b){
   int subResult=a-b;
   return subResult;
    }
public static void main(String args[])
  {
AirthmaticOperation s=new AirthmaticOperation();

int addResult=s.add(10,20);
System.out.println("the addation of two no is"+addResult);

int subResult=s.sub(10,20);
System.out.println("the sub of two no is"+subResult);
}
}

  
