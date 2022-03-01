package curs3.curs3.mostenire;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private void setWidth(int width) {
        this.width = width;
    }



    public int getLength() {
        return length;
    }

    private int getWidth() {
        return width;
    }

    private int calculateArea(){
        return length * width;
    }




}
