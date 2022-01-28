package Oops;

class vehicle{
    int wheel;

    vehicle(int noOfWheels){  //parameterize constructor
        wheel=noOfWheels;
    }
}

public class ParameterizeConstructor {
    public static void main(String[] args) {
        vehicle car =new vehicle(4); //object
    vehicle bike =new vehicle(2);

    System.out.println(car.wheel +" Wheel"+ " is Car");
    System.out.println(bike.wheel+ " wheel"+" is bike");
    }
}
