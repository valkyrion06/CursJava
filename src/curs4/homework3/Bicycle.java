package curs4.homework3;

public class Bicycle extends Vehicle {

    public Bicycle(String brand, int pollutionLevel, String medianSpeed){
        setBrand(brand);
        setPollutionLvl(pollutionLevel);
        setMedianSpeed(medianSpeed);
    }

    @Override
    public void vehicleDetails(){
        System.out.println("The pollution level for the bicycle " + name() + " is: " + motorisation() + " and the median speed reached is " + motorisation());
    }





}
