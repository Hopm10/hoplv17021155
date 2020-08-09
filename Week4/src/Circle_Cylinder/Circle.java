package Circle_Cylinder;

public class Circle {
    private double radius;
    protected final double PI = 3.14;
    private String color;
    Circle(){
        radius = 1.0;
        color = "red";
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
