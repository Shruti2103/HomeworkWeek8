package poolarea;

public class Cuboid extends Rectangle{
     double height;

     public  Cuboid(double width, double height, double length){
         super(width, length);
         if(height<0){
             this.height=0;
         }else{
             this.height=height;
         }


     }

// getheight method
    public double getHeight(){
         return height;
    }
// get volume
    public double getVolume(){



         return getArea()*height;
    }





}
