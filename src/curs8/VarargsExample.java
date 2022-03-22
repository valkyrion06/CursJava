package curs8;

public class VarargsExample {

    public static void main (String[]args){
        VarargsExample varargsExample = new VarargsExample();
        //varargsExample.printStringArguments("one","two","three");
        //varargsExample.printIntArguments(1,2,3,4);
        varargsExample.printAnyArguments(1,"2",'c');


    }

    public void printStringArguments(String...values){
        for(String value: values){
            System.out.println(value);
        }

    }

    public void printIntArguments(int...values){
        for(int value: values){
            System.out.println(value);
        }

    }

    public void printMultipleArguments(String text,int...values){
        System.out.println(text);
        for(int value: values){
            System.out.println(value);
        }
    }

    public <T> void printAnyArguments(T...values){
        for (T value : values){
            System.out.println(value);
        }
    }

}
