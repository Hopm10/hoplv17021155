package Exceptions;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression e = new Numeral(4);
        Expression e1 = new Square(e);
        Expression e2 = new Numeral(0);
        Expression e3 = new Addition(e1, e2);
        try {
            Expression e4 = new Division(e1, e2);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(e3.evaluate());
        System.out.println(e3.toString());
        e3.toString();
    }
}
