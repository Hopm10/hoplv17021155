package task2;
import task1.*;
import task1.Week3Task1;

public class Fraction extends Week3Task1{
    /**
     * declare attributes here
     */
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    /**
     * declare constructor here
     */
    // Tối giản phân số
    public void reduce (){
        int i = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator()/i);
        this.setDenominator(this.getDenominator()/i);
    }
    /**
     * methods
     */

    // add
    public Fraction add(Fraction ps) {
        int ts = this.getNumerator() * ps.getDenominator() + ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.reduce();
        Fraction pst = new Fraction(phanSoTong.numerator, phanSoTong.denominator);
//        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
        return pst;
    }

    // subtract
    public Fraction subtract(Fraction ps) {
        int ts = this.getNumerator() * ps.getDenominator() - ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.reduce();
        Fraction psh = new Fraction(phanSoHieu.numerator, phanSoHieu.denominator);
        return psh;
    }

    // multiple
    public Fraction multiple(Fraction ps) {
        int ts = this.getNumerator() * ps.getNumerator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.reduce();
        Fraction psn = new Fraction(phanSoTich.numerator, phanSoTich.denominator);
        return psn;
    }

    // divide
    public Fraction divide(Fraction ps) {
        int ts = this.getNumerator() * ps.getDenominator();
        int ms = this.getDenominator() * ps.getNumerator();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.reduce();
        Fraction psc = new Fraction(phanSoThuong.numerator, phanSoThuong.denominator);
        return psc;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
//            int left = this.getNumerator()*other.getDenominator();
//            int right = this.getDenominator()*other.getNumerator();
//            if(left-right == 0)
//                return true;
            if(this.subtract(other).getNumerator() == 0){
                return true;
            }
        }
        return false;
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

}
