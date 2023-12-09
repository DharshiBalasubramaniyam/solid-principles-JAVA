import OperationFactory.OperationFactory;
import OperationFactory.OperationFactoryImpl;
import Operation.InvalidOperation;
import Operation.Operation;

public class CalculatorApp {
    private final int operation;
    private final double operand1;
    private final double operand2;

    public CalculatorApp(int operation, double operand1, double operand2) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public int getOperation() {
        return operation;
    }
    public double getOperand1() {
        return operand1;
    }
    public double getOperand2() {
        return operand2;
    }

    public double execute() throws InvalidOperation {
        OperationFactory operationFactory = new OperationFactoryImpl();
        Operation operation = operationFactory.getInstance(getOperation());

        return operation.calculate(getOperand1(), getOperand2()) ;
    }
}
