package OperationFactory;

import Operation.Operation;
import Operation.AddOperation;
import Operation.SubOperation;
import Operation.MulOperation;
import Operation.DivOperation;
import Operation.InvalidOperation;
public class OperationFactoryImpl implements OperationFactory{
    @Override
    public Operation getInstance(int choice) throws InvalidOperation {
        if(choice==1)
            return new AddOperation();
        else if(choice==2)
            return new SubOperation();
        else if(choice==3)
            return new MulOperation();
        else if(choice==4)
            return new DivOperation();
        throw new InvalidOperation("Invalid operation selected!");
    }
}
