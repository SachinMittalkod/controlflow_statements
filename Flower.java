class Flower
{
String name;
String colour;
int noOfPetals;
void blooming(){
System.out.println(noOfPetals+" "+colour+" "+name+" is blooming...!");
}
void shedFragrance(){
System.out.println(noOfPetals+"  "+colour+" "+name+" is sheding Fragrance");
}
public static void main(String args[]){
    Flower rose=new Flower();
    rose.name="Rose";
    rose.colour="Red";
    rose.noOfPetals=12;
    rose.blooming();
    rose.shedFragrance();
}
}