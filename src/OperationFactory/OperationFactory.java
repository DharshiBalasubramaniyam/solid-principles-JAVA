package OperationFactory;

import Operation.Operation;
import Operation.InvalidOperation;

public interface OperationFactory {
    Operation getInstance(int choice) throws InvalidOperation;
}
