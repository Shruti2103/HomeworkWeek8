package carpetcostcalculator;

public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {

        if (length < 0 && width > 0) {
            this.length = 0;
            this.width = width;
        } else if (length > 0 && width < 0) {

            this.width = 0;
            this.length = length;
        } else {
            this.length = length;
            this.width = width;

        }


    }

    // instance method
    public double getArea() {

        return this.length * this.width;
    }


}
