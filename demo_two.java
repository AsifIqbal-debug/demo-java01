class Calculator{
    int numberOne;
    int numberTwo;
    public void calculator(){
        System.out.println("Addition:"+(this.numberOne+this.numberTwo));
        System.out.println("Sub:"+(this.numberOne-this.numberTwo));
        System.out.println("Multiplication: "+(this.numberOne*this.numberTwo));
        System.out.println("Divide: "+(this.numberOne/this.numberTwo));
    }

}
public class demo_two {
    public static void main(String[] args)
    {
        Calculator ex_one= new Calculator();
        ex_one.numberOne=100;
        ex_one.numberTwo=20;
        ex_one.calculator();

        Calculator ex_two= new Calculator();
        ex_two.numberOne=200;
        ex_two.numberTwo=10;
        ex_two.calculator();
    }
}

