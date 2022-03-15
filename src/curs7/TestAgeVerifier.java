package curs7;

public class TestAgeVerifier {
    public static void main(String[]args){
        AgeVerifier ageVerifier = new AgeVerifier();
        try {
            ageVerifier.checkAgeLimit(3);
        } catch (MyCustomException e) {
            System.out.println("Must be over 18 to vote.");
            e.printStackTrace();
        }
    }
}
