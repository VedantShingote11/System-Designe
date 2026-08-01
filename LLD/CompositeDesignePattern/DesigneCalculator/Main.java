package LLD.CompositeDesignePattern.DesigneCalculator;

public class Main {
    public static void main(String[] args) {
        
        Number num1 = new Number(2);
        Number num2 = new Number(3);
        Number num3 = new Number(4);

        ArithmeticExpression exp1 = new Expression(num1, num2, Operation.MUL);
        ArithmeticExpression res = new Expression(num3, exp1, Operation.ADD);

        System.out.println(res.evaluate());

    }
}
