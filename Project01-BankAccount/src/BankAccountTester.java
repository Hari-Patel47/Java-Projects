/**
 * A class that tests our bank acount class.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        //Testing our three constructors
        System.out.println("Testing Constructors");
        
        BankAccount blank = new BankAccount();
        BankAccount withBalances = new BankAccount(1000,1000, "Alice", 1234, 123456789, 0.1, 5);
        BankAccount noBalances = new BankAccount("Bob", 4321, 987654321, 0.2, 3);
        
        blank.printInfo();
        withBalances.printInfo();
        noBalances.printInfo();
        
        //Testing our deposits
        System.out.println("Testing Deposits");
        
        blank.depositChecking(500);
        blank.depositSavings(1000);
        
        blank.printInfo();
        
        //Testing our withdrawals
        System.out.println("Testing Withdrawals");
        
        blank.withdrawalChecking(500);
        blank.withdrawalSavings(1000);
        
        blank.printInfo();
        
        //Testing our get balance methods
        System.out.println("Testing get balance");
        
        System.out.println(blank.getChecking());
        System.out.println(blank.getSavings());
        
        //Testing transfering
        System.out.println("Testing transfering");
        
        withBalances.transferToChecking(50);
        
        withBalances.printInfo();
        
        withBalances.transferToSavings(50);
        
        withBalances.printInfo();
        
        //Testing delete
        System.out.println("Testing Delete");
        
        noBalances.delete();
        
        noBalances.printInfo();
        
        //Testing adding Interest
        System.out.println("Testing Adding Interest");
        
        withBalances.addInterest();
        
        withBalances.printInfo();
    }
}