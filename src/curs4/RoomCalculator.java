package curs4;

public class RoomCalculator {

    public static void main(String[] args){
            Rectangle rectangle1 = new Rectangle ();
            rectangle1.setWidth(20);
            rectangle1.setLength(30);
            //rectangle1.calculateArea();
            //System.out.println(rectangle1.calculatePerimeter());



            Rectangle rectangle2 = new Rectangle(10,12);

            System.out.println(rectangle2.calculatePerimeter());
            rectangle2.calculatePerimeter();


    }

}
