
public class BankAccountTesterMe
{
    public static void main(String[] args)
    {
        System.out.println("Testing Constructor \n");
        BankAccount blank = new BankAccount();
        BankAccount withBalance = new BankAccount(1000,1000, "Alice", 1234, 123456789, .1, 5);
        BankAccount noBalance = new BankAccount("Bob", 4321, 987654321, .2, 3);
        
        
        blank.printInfo();
        withBalance.printInfo();
        noBalance.printInfo();
        
        System.out.println("Testing Deposits \n");
        blank.depositChecking(500);
        
        blank.printInfo();
        
        
    }
}
