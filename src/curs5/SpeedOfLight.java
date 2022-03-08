package curs5;

public class SpeedOfLight {


    public final int SPEED_OF_LIGHT = 300000;
    short days;
    public SpeedOfLight(short days){
        this.days = days;
    }
    public static void main(String[]args){
        SpeedOfLight speedOfLight = new SpeedOfLight((short) 365);
        speedOfLight.calculateDistance();



    }

    public int calculateSecondsFromDays(){
        int seconds = days*24*60*60;
        return seconds;
    }

    public void calculateDistance(){
        int distance = SPEED_OF_LIGHT * calculateSecondsFromDays();
        System.out.println("Distance travelled :" + distance);
    }

}
