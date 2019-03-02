package MD;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {


    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;


    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("eM", "De", 1000, BankAccount.CHECKING);
        System.out.println("Running test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100},
                {200.00, true, 1200},
                {325.14, true, 1325.14},
                {1000.00, true, 2000.00}

        });
    }

    @org.junit.Test
    public void deposit() throws Exception {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }
}
