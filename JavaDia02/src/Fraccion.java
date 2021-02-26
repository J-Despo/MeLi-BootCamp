public class Fraccion {
    public static void main(String[] args) {

        System.out.print("3/4 = ");
        Fraction x1 = new Fraction(3, 4);
        System.out.println(x1);

        System.out.print("1/2 + 1 = ");
        Fraction x2 = new Fraction(1, 2).plus(1);
        System.out.println(x2);

        System.out.print("1/2 + 1/2 = ");
        Fraction x3 = new Fraction(1, 2).plus(new Fraction(1, 2));
        System.out.println(x3);

        System.out.print("1/2 - 1 = ");
        Fraction x4 = new Fraction(1, 2).minus(1);
        System.out.println(x4);

        System.out.print("1/2 - 1/4 = ");
        Fraction x5 = new Fraction(1, 2).minus(new Fraction(1, 4));
        System.out.println(x5);

        System.out.print("7/3 * 3 = ");
        Fraction x6 = new Fraction(7, 3).multiply(3);
        System.out.println(x6);

        System.out.print("4/2 * 1/2 = ");
        Fraction x7 = new Fraction(4, 2).multiply(new Fraction(1, 2));
        System.out.println(x7);

        System.out.print("3/5 / 2 = ");
        Fraction x8 = new Fraction(3, 5).divide(2);
        System.out.println(x8);

        System.out.print("2/2 / 10/5 = ");
        Fraction x9 = new Fraction(2, 2).divide(new Fraction(10, 5));
        System.out.println(x9);
    }
}

class Fraction {

    private int numerator = 0;
    private int denominator = 0;

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction(Fraction f) {
        this.setNumerator(f.getNumerator());
        this.setDenominator(f.getDenominator());
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public Fraction plus(int i) {
        int numerator = i * this.getDenominator() + this.getNumerator();
        int denominator = this.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction plus(Fraction f) {
        int denominator = this.getDenominator() * f.getDenominator();
        int numerator =
                this.getNumerator() * f.getDenominator()
                        +
                        f.getNumerator() * this.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(int i) {
        int numerator = this.getNumerator() - i * this.getDenominator();
        int denominator = this.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(Fraction f) {
        int denominator = this.getDenominator() * f.getDenominator();
        int numerator =
                this.getNumerator() * f.getDenominator()
                        -
                        f.getNumerator() * this.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(int i) {
        int numerator = this.getNumerator() * i;
        int denominator = this.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(Fraction f) {
        int numerator = this.getNumerator() * f.getNumerator();
        int denominator = this.getDenominator() * f.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(int i) {
        int numerator = this.getNumerator();
        int denominator = this.getDenominator() * i;
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction f) {
        int numerator = this.getNumerator() * f.getDenominator();
        int denominator = this.getDenominator() * f.getNumerator();
        return new Fraction(numerator, denominator);
    }

    public String toString() {
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }
}