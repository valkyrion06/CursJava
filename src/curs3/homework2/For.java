package curs3.homework2;

public class For {



    public static void main (String[] Args){
        For newFor = new For();
        newFor.evenNumbers();

    }

    public void evenNumbers(){
        for (int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
