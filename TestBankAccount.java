package store;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

@Test

public void testDebitAmount(){

BankAccount account = new BankAccount(10);
double amount = account.debit(4);

Assert.assertEquals(4.0, amount);
}

