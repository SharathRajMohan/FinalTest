public class Number extends ArithmeticExp{
    private double number;

    public Number(double value) {
        this.number = value;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public double evaluate() {
        return this.getNumber();
    }

    @Override
    public String toString() {
        return ""+this.number;
    }
}
