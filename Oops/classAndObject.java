package Oops;


class car{ //class
    String brand;
    int modelNo;
    public void detail() //function or method 
    {
        System.out.println("My car is "+brand+ " its Model no is "+modelNo);
    }
}
public class classAndObject {
    public static void main(String[] args) {
        car car=new car(); //object
        car.brand="TATA";
        car.modelNo=2020;
        car.detail();
    } 
}
