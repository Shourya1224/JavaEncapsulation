public class Rectangle {
   
    private double length;
    private double width;

    
    public void setLength(double length) {
        this.length = length;
    }

   
    public void setWidth(double width) {
        this.width = width;
    }


    public double getArea() {
        return length * width;
    }

  
    public double getPerimeter() {
        return 2 * (length + width);
    }
}