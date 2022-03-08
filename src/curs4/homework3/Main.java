package curs4.homework3;

public class Main {

    public static void main(String[] args){
        Vehicle bike = new Bicycle("Phoneix",0,"15km/h");
        Vehicle car = new Car("Dacia", 5, "100km/h");

        Main main = new Main();
        main.verifyMotorisation(bike);
        main.verifyMotorisation(car);

        bike.vehicleDetails();
        car.vehicleDetails();
    }

    public void verifyMotorisation(Vehicle vehicle){
        System.out.println(vehicle.name());
        System.out.println(vehicle.motorisation());
    }

}
