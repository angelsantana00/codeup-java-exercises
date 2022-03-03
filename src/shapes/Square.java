package shapes;

class Square extends Quadrilateral {
    public Square(double side){
        super (side, side);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea() {
        return this.length * this.width;
    }

}




//package shapes;
//
//public class Square extends Rectangle {
//
//    public Square (int side) {
//        super (side, side);
//    }
//}
