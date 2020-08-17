package Exceptions;

public class Numeral extends Expression{
    private int value;
    public Numeral(int value){
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "" +this.value;
    }
}
