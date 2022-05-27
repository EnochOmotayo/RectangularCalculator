public class Shape {

    int squareRoom;//The number of square rooms.
    int perimeter;
    int area;
    int lengthSide;

    public Shape(){
        
    }


    public Shape(int squareRoom, int perimeter, int area, int lengthSide) {
        this.squareRoom = squareRoom;
        this.perimeter = perimeter;
        this.area = area;
        this.lengthSide = lengthSide;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getSquareRoom() {
        return squareRoom;
    }

    public void setSquareRoom(int squareRoom) {
        this.squareRoom = squareRoom;
    }
    
}
