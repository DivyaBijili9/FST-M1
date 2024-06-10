import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    public void notEnoughFunds(){
        BankAccount bal=new BankAccount(9);
        assertThrows(NotEnoughFundsException.class,()->bal.withdraw(10),"Balance must be greater than the withdraw amount");

    }
    @Test
    public void EnoughFunds(){
        BankAccount bal=new BankAccount(100);
        assertDoesNotThrow(()->bal.withdraw(100));

    }

}
