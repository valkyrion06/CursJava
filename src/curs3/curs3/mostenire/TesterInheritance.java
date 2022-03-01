package curs3.curs3.mostenire;

public class TesterInheritance {

    public static void main(String[] args){

        AutomatedTester tester = new AutomatedTester();
        tester.setSeniority("Junior");
        tester.setProgrammingLanguage("Java");
        tester.setDepartment("QA");
        tester.setEmail("oana@apple.com");
        tester.setName("Oana");

        System.out.println("Name: " + tester.getName() +
                " Department: " + tester.getDepartment() +
                " Seniority: " + tester.getSeniority());

    }


}
