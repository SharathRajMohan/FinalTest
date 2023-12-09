public class Main {
    public static void main(String[] args) {
        System.out.println("Final Exam");
        // Simple expression : A+B
        int left = 2;
        int right = 3;
        Number left_operand = new Number(left);
        Number right_operand = new Number(right);
        ArithmeticExp result = new Sum(left_operand , right_operand);
        System.out.println("The result is :"+result.evaluate());
        System.out.println("The string representation is : \n"+ result.toString());

        // constructing the expression (2*3) + 6
        ArithmeticExp expr = new Sum(
                new Product(
                        new Number(2),
                        new Number(3)
                ),
                new Number(4)
        );


        System.out.println("The result is :"+expr.evaluate());
        System.out.println("The string representation is : \n"+ expr.toString());
    }
}