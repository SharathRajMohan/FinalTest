public class Product extends Binary{
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left,right);
    }


    @Override
    public double evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }

    @Override
    public String toString() {
        return super.toString()+"\nOperation"+getLeft().evaluate()+"*"+getRight().evaluate()+"\nResult: "+this.evaluate();
    }

}
