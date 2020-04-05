class Point {
    String id, color;
    double x, y;

    public Point(String id, String color, double x, double y) {
        this.id = id;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(char xDirection, char yDirection) {
        switch (xDirection) {
            case ('L'):
                this.x--;
                break;
            case ('R'):
                this.x++;
                break;
        }
        switch (yDirection) {
            case ('U'):
                this.y++;
                break;
            case ('D'):
                this.y--;
                break;
        }
    }

    public void draw() {
        System.out.println(String.format("ID: %s, X: %f, Y: %f", this.id, this.x, this.y));
    }

}


public class Canvas {
    List Point = new Point();

    public Canvas(List point) {
       this.Point = point;
    }

    public void printCoordinates() {
        System.out.println(String.format("ID: %s, X: %f, Y: %f", this.Point.id, this.Point.x, this.Point.y));
    }

}