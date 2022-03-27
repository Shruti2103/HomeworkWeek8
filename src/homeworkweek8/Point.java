package homeworkweek8;

public class Point {
    int x;
    int y;


    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }

    public Point() {


    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int setX(int x) {
        return x;
    }

    public int setY(int y) {
        return y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {// returns distance betwwn this points(x,y)

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)*(y-this.y));
      //return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

    }

    public double distance(Point another) {// returns distance between this point and another point
        return distance(another.x, another.y);
    }// end of instance methods


}
