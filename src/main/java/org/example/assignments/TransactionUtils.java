package org.example.assignments;

import java.util.List;

public class TransactionUtils {
public static List<WalletTransaction> filterByType(List<WalletTransaction> t, String type) {
    return t.stream()
            .filter(a->a.type().equalsIgnoreCase(type))
            .toList();
}
public static double totalAmount(List<WalletTransaction> t) {
    return t.stream()
            .mapToDouble(WalletTransaction::amount)
            .sum();
}
public static int totalCredits(List<WalletTransaction> t) {
    return (int) t.stream()
            .filter(tx->(tx.type().equals("CREDIT")?true:false))
            .count();
}
public static int totalDebits(List<WalletTransaction> t) {
    return (int) t.stream()
            .filter(tx->tx.type().equals("DEBIT")?true:false)
            .count();
}

public static double balance(List<WalletTransaction> t) {
    double sum=t.stream()
            .mapToDouble(tx->tx.type().equals("DEBIT")?-tx.amount() : tx.amount())
            .sum();
    return sum;
}
}
