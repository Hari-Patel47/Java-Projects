
public class BankAccount
{
    private double checkingBalance;
    private double savingsBalance;
    private String customerName;
    private int pin;
    private int debitCardNumber;
    private double interestRate;
    private int withdrawalLimitsPerDay;

    /**
     * Constructor that sets all number instanse varibles to be 0 and the string varible to be the empty string. 
     */
    public BankAccount()
    {
        checkingBalance = 0;
        savingsBalance = 0;
        customerName = "";
        pin = 0;
        debitCardNumber = 0;
        interestRate = 0;
        withdrawalLimitsPerDay = 0;
    }
    
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(double checking, double savings, String name, int customerPin, int cardNumber, double currentInterest, int limits)
    {
        checkingBalance = checking;
        savingsBalance = savings;
        customerName = name;
        pin = customerPin;
        debitCardNumber = cardNumber;
        interestRate = currentInterest;
        withdrawalLimitsPerDay = limits;
    }

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(String name, int customerPin, int cardNumber, double currentInterest, int limits)
    {
        checkingBalance = 0;
        savingsBalance = 0;
        customerName = name;
        pin = customerPin;
        debitCardNumber = cardNumber;
        interestRate = currentInterest;
        withdrawalLimitsPerDay = limits;
    }
    
    /**
     * Deposits money into checking account.
     *
     * @param  amount The amount of money you want to deposit.
     */
    public void depositChecking(double amount)
    {
        checkingBalance = checkingBalance + amount;
    }
    
    /**
     * Deposits money into savings account.
     *
     * @param  amount The amount of money you want to deposit.
     */
    public void depositSavings(double amount)
    {
        savingsBalance = savingsBalance + amount;
    }
    
    /**
     * Withdrawals money from checking account.
     *
     * @param  amount The amount of money you want to withdrawal.
     */
    public void withdrawalChecking(double amount)
    {
        checkingBalance = checkingBalance - amount;
    }
    
    /**
     * Withdrawals money from savings account.
     *
     * @param amount The amount of money you want to withdrawal.
     */
    public void withdrawalSavings(double amount)
    {
        savingsBalance = savingsBalance - amount;
    }
    
    /**
     * Gets the current balance of the checking account.
     *
     * @return checkingBalance The amount of money in the checking account. 
     */
    public double getChecking()
    {
        return checkingBalance;
    }
    
    /**
     * Gets the current balance of the savings account.
     *
     * @return savingsBalance The amount of money in the savings account. 
     */
    public double getSavings()
    {
        return savingsBalance;
    }
    
    /**
     * Transfers money from the checking account to the savings account.
     *
     * @param amount The amount of money you want to transfer to the savings account. 
     */
    public void transferToSavings(double amount)
    {
        checkingBalance = checkingBalance - amount;
        savingsBalance = savingsBalance + amount;
    }
    
    /**
     * Transfers money from the savings account to the checking account.
     *
     * @param amount The amount of money you want to transfer to the checking account.
     */
    public void transferToChecking(double amount)
    {
        withdrawalSavings(amount);
        depositChecking(amount);
    }
    
    /**
     * Deletes a bank account by sets all number instanse varibles to be 0 and the string varible to be the empty. 
     */
    public void delete()
    {
        checkingBalance = 0;
        savingsBalance = 0;
        customerName = "";
        pin = 0;
        debitCardNumber = 0;
        interestRate = 0;
        withdrawalLimitsPerDay = 0;
    }
    
    /**
     * Adds interest to the savingsBalace
     */
    public void addInterest()
    {
        //1000
        //10%
        //1000*1.1
        //savingsBalance = savingsBalance * (1 + interestRate)
        double amount = interestRate * savingsBalance;
        depositSavings(amount);
    }
    
    /**
     * Prints the information from the instance Variables
     */
    public void printInfo()
    {
        System.out.println("Checking Balance: " + checkingBalance);
        System.out.println("Savings Balance: " + savingsBalance);
        System.out.println("Name: " + customerName);
        System.out.println("Pin: " + pin);
        System.out.println("Debit Card Number: " + debitCardNumber);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Withdrawal Limits Per Day: " + withdrawalLimitsPerDay + "\n");
    }
}
