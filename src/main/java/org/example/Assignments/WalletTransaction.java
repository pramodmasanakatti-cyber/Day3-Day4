package org.example.Assignments;

public record WalletTransaction(String id, double amount, String type) {
    public WalletTransaction{
     if(id==null || id.isBlank()) {
         throw new IllegalArgumentException("Transaction ID is required");
     }
     if(amount<=0) {
         throw new IllegalArgumentException("Amount must be positive");
     }
     if(!type.equals("CREDIT") && !type.equals("DEBIT")) {
         throw new IllegalArgumentException("Invalid transaction type");
     }
    }
}

