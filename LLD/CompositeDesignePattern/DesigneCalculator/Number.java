package LLD.CompositeDesignePattern.DesigneCalculator;

public class Number implements ArithmeticExpression{
    
    int number;

    Number(int number){
        this.number = number;
    }

    @Override
    public int evaluate(){
        return number;
    }

}
