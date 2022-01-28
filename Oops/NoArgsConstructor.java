package Oops;
class Vehicel{
    int tyre;
    Vehicel()       //constructor
    {
        tyre=4;
    }
}
public class NoArgsConstructor {
    public static void main(String[] args) 
    {
        Vehicel car=new Vehicel();
        System.out.println(car.tyre +" Wheels");
    }
       
}
