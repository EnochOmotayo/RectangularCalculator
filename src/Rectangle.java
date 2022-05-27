public class Rectangle {

    static int numberOfRooms = 0;

    private double length;
    private double breadth;

    public Rectangle() {
        numberOfRooms++;
    }

    public Rectangle(double length, double breadth) {
        setLength(length);
        setBreadth(breadth);
        numberOfRooms++;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return this.length * this.breadth;
    }

    public double calculatePerimeter() {
        double oppositeSides = this.length + this.length;
        double oppositeSides2 = this.breadth + this.breadth;
        return oppositeSides + oppositeSides2;
    }

}
