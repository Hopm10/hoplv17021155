package Exceptions;

public class Division extends BinaryExpression{
    Expression top;
    Expression bottom;
    Division(Expression top, Expression bottom){
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double evaluate() {
        return top.evaluate()/bottom.evaluate();

    }

    @Override
    public String toString() {
        return "(" + this.top.toString() + "/" + this.bottom.toString() +")";
    }

    public static void main(String[] args) {
        Expression e = new Numeral(2);
        Expression e1 = new Numeral(0);
        Expression e2 = new Division(e,e1);
        System.out.println( e2.evaluate());
    }
}
