package LLD.CompositeDesignePattern.DesigneCalculator;

public class Expression implements ArithmeticExpression{
    
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    Expression(ArithmeticExpression leftPart , ArithmeticExpression rightPart , Operation operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        
        int value=0;

        switch (operation) {
            case ADD: value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUB: value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MUL: value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIV: value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            default:
                break;
        }

        return value;

    }
}
