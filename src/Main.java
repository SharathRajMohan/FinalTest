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
        System.out.println("The string representation is : \n"+ result);

        // constructing the expression (2.3*3) + 6
        ArithmeticExp expr = new Sum(
                new Product(
                        new Number(2.3),
                        new Number(3)
                ),
                new Number(4)
        );

        System.out.println("The result is :"+expr.evaluate());
        System.out.println("The string representation is : \n"+ expr);

        // constructing the expression 10%3
        ArithmeticExp modexpr = new Modulo(new Number(10),new Number(3));

        System.out.println("The result is :"+modexpr.evaluate());
        System.out.println("The string representation is : \n"+ modexpr);
    }
}