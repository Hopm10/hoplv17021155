package Bai2;

public class Square extends Rectangle{
    Square(){};
    Square (double size){
        super(size,size);
    };
    Square(double size, String color, boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{ side = " + getSize()+
                ", color = " + super.getColor()+
                ", filled = " + super.isFilled()+
                " }";
    }
}
