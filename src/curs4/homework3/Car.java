package curs4.homework3;

public class Car extends Vehicle{

    public Car(String brand, int pollutionLevel, String medianSpeed){
        setBrand(brand);
        setPollutionLvl(pollutionLevel);
        setMedianSpeed(medianSpeed);
    }

    @Override
     public void vehicleDetails(){
        System.out.println("The pollution level for the car " + name() + " is: " + motorisation() + " and the median speed reached is " + motorisation());
    }

}
