package poolarea;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length){

        if (width < 0  && length >0) {
            this.length = length;
            this.width=0;
        } else if (width >0 && length <0) {
            this.length = 0;
            this.width=width;

        } else{
            this.length=length;
            this.width=width;
        }


    }

// instance method
    public double getWidth(){
        return width;
    }
// instance method
    public double getLength(){
        return length;
    }
  // get area instance method
  public  double getArea(){
        return width*length;
  }



}
