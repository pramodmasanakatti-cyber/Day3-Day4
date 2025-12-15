package org.example.Assignments;

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
}
