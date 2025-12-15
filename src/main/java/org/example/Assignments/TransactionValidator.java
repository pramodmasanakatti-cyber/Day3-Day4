package org.example.Assignments;

public class TransactionValidator {

    public static String validateTransaction(Transaction t) {
        return switch (t) {
            case Credit c -> c.amount() > 0 ? "Valid credit" : "Invalid credit";
            case Debit d -> d.amount() > 0 ? "Valid debit" : "Invalid debit";
            default -> throw new IllegalStateException("Unexpected value: " + t);
        };
    }
}
