package curs4;

public class TestOverride {

    public static void main(String[] args){
        Employee employee = new Employee();
        Employee employee2 = new Tester();
        Tester tester = new Tester();
        Developper developper = new Developper();


        employee.work();
        tester.work();
        tester.writeTests();
        developper.work();

        employee2.work();
        ((Tester)employee2).writeTests();

        Employee tester3 = new Tester();
        tester3.work();
        tester3 = new Developper();
        tester3.work();



    }

}
