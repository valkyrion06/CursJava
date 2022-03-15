package curs7;

public class AgeVerifier {

    public void checkAgeLimit(int age) throws MyCustomException {
        if(age<18){
            throw new MyCustomException("Invalid age to proceed.");
        }else {
            System.out.println("Voting allowed.");
        }
    }

}
