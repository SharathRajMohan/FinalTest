public abstract class Binary extends ArithmeticExp{
    private ArithmeticExp left;
    private ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    public ArithmeticExp getLeft() {
        return left;
    }


    public ArithmeticExp getRight() {
        return right;
    }



    @Override
    public String toString() {
        return "Parent Class Binary{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}
