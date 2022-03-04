package curs3.homework2;

public class Qualification extends Teacher{

    public Qualification(String course, int experienceYears, String schedule){
        setCourse(course);
        setExperienceYears(experienceYears);
        setSchedule(schedule);
    }


    public void verify(){
        if(getExperienceYears() > 3 && getCourse().equals("Java") && getSchedule().equals("Afternoon")){
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }

}
