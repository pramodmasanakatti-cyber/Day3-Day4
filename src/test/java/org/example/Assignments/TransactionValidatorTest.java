package org.example.Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionValidatorTest {
@Test
    void validTransaction() {
    Transaction credit=new Credit(10);

    assertEquals("valid credit",TransactionValidator.validateTransaction(credit));
}


}