class CalculatorOne{

    public void calculator(int numberOne, int numberTwo){
        System.out.println("Addition:"+(numberOne+numberTwo));
        System.out.println("Sub:"+(numberOne-numberTwo));
        System.out.println("Multiplication: "+(numberOne*numberTwo));
        System.out.println("Divide: "+(numberOne/numberTwo));
    }
}
public class demo_three {
    public static void main(String[] args)
    {
        CalculatorOne ex_one= new CalculatorOne();
        ex_one.calculator(200,10);
        CalculatorOne ex_two= new CalculatorOne();
        ex_two.calculator(300,20);
    }
}
