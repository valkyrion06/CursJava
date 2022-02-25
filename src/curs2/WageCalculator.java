package curs2;

public class WageCalculator {

    int hoursWorked = 40;

    public static void main(String []args){
        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        WageCalculator wageCalculator = new WageCalculator();



        tester1.setName("Oana");
        tester2.setName("Maria");

        tester1.setRatePerHour(30);
        tester2.setRatePerHour(45);
        //System.out.println(tester1.getName());

        System.out.println("Salariul lui este " + tester1.getName() + " " + wageCalculator.calculateSalary(tester1.getRatePerHour()));





    }

    public int calculateSalary(int ratePerHour){
        int salary = ratePerHour * hoursWorked;


        return salary;
    }

}
