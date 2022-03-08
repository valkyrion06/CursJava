package curs4.homework3;

public class Vehicle {

    private String brand;
    private int pollutionLvl;
    private String medianSpeed;


    public void vehicleDetails(){
        System.out.println("The pollution level for the vehicle " + name() + " is: " + motorisation() + " and the median speed reached is " + motorisation());
    }

    public String motorisation(){
        return medianSpeed;
    }

    public String name(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPollutionLvl(int pollutionLvl) {
        this.pollutionLvl = pollutionLvl;
    }

    public void setMedianSpeed(String medianSpeed) {
        this.medianSpeed = medianSpeed;
    }
}
