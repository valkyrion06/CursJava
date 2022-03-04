package curs4;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(){};

    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculateArea(){
        int area = length*width;
        System.out.println(area);
    }

    public int calculatePerimeter(){
        int perimeter = 2*length + 2*width;
        return perimeter;
    }




}
