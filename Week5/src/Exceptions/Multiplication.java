package Exceptions;

public class Multiplication extends BinaryExpression{
    public Expression left;
    public Expression right;
    Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return (double) (left.evaluate() * right.evaluate());
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "*" + right.toString() + ')';
    }
}
