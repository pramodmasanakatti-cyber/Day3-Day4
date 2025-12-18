package org.example.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Transaction1ValidatorTest {
    public List<WalletTransaction> walletTransactions=new ArrayList<>(Arrays.asList(
            new WalletTransaction("TXN001",100,"CREDIT"),
            new WalletTransaction("TXN002",200,"CREDIT")
            ,new WalletTransaction("TXN003",100,"DEBIT")));
@Test
    void validCreditTest() {

    Transactable credit=new Credit(10);
    assertEquals("Valid credit",TransactionValidator.validateTransaction(credit));
}
@Test
    void invalidCreditTest() {
    Transactable credit=new Credit(-10);
    assertEquals("Invalid credit",TransactionValidator.validateTransaction(credit));
}

@Test
    void validDebitTest() {
Transactable debit=new Debit(10);
assertEquals("Valid debit",TransactionValidator.validateTransaction(debit));
}
@Test
    void invalidDebitTest() {
    Transactable debit=new Debit(-10);
    assertEquals("Invalid debit",TransactionValidator.validateTransaction(debit));
}
@Test
    void nullableTransacttableTest() {
    Transactable transactable=null;
    assertEquals("Invalid transaction",TransactionValidator.validateTransaction(transactable));
}
//@Test
//    void validateTotalAmount() {
//
//    assertEquals(400,TransactionUtils.totalAmount(walletTransactions));
//}
//
//@Test
//    void totalCredits() {
//    assertEquals(2,TransactionUtils.totalCredits(walletTransactions));
//}
//@Test
//void totalDebits() {
//    assertEquals(1,TransactionUtils.totalDebits(walletTransactions));
//}
//@Test
//    void balance() {
//    assertEquals(200,TransactionUtils.balance(walletTransactions));
//}
}