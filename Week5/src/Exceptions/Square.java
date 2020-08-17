package Exceptions;

public class Square extends Expression{
    private Expression expression;
    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public double evaluate() {
        return Math.pow((double)expression.evaluate(), 2);
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ")^2";
    }
}
