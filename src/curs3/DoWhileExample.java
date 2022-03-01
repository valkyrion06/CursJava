package curs3;

public class DoWhileExample {

    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four"};

        int j = 0;
       /* while (j < array.length) {
            System.out.println(array[j]);
            j++;
        } */

        do{
            System.out.println(array[j]);
            j++;

        }while (j<array.length);

    }
}
