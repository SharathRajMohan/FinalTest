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

    public void setLeft(ArithmeticExp left) {
        this.left = left;
    }

    public ArithmeticExp getRight() {
        return right;
    }

    public void setRight(ArithmeticExp right) {
        this.right = right;
    }


    @Override
    public String toString() {
        return "Binary{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}
