package arithmetic;

import java.util.Scanner;

/** This class takes an enum input for arithmetic operations such as plus, minus, divide, and times
 * from user and executes the arithmetic operation
 * 
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase {
 
    enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }
    
    double calculate(double x, double y) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        Operation operation = Operation.valueOf(sc.next().toUpperCase());
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
