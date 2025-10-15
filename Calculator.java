public class Calculator{
    public static void main(String[] args){
 CalculatorLogic calc = new CalculatorLogic();

 double num1 = 10;
 double num2 = 5;

 double sum = calc.add(num1, num2);
 double difference = calc.subtract(num1, num2);
 double product = calc.multiply(num1, num2);
 double quotient = calc.divide(num1, num2);

 System.out.println("Sum: " + sum);
 System.out.println("Difference: " + difference);
 System.out.println("Product: " + product);
 System.out.println("Quotient: " + quotient);



    }

}