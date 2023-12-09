public class Sum extends Binary{
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left,right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() + getRight().evaluate();
    }

    @Override
    public String toString() {
        return super.toString()+"Result (L+R): "+evaluate();
    }
}
