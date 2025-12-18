package org.example.assignments;

public class TransactionValidator {

    public  static String validateTransaction(Transactable t) {
        return switch (t) {
            case Credit c -> c.amount() > 0 ? "Valid credit" : "Invalid credit";
            case Debit d -> d.amount() > 0 ? "Valid debit" : "Invalid debit";
            case null-> "Invalid transaction";
            default -> throw new IllegalStateException("Unexpected value: " + t);
        };
    }
}
