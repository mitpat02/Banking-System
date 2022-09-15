public class SavingsAccount extends BankAccount //subclass inherits superclass BankAccount
{
    public SavingsAccount(double balance,double annualRate) //arg constructor 
    {
        super(balance,annualRate);//super used to call superclass constructor

    }

    public double statusCheck()
    {
        if(getBalance() < 25)
        {
            System.out.println("****INACTIVE ACCOUNT****")  ;          
        }
        else        
            System.out.println("****ACTIVE ACCOUNT****");  
            return 0;             
    }

    public  double deposit(double d)    //abstract method deposit to get user input and check balance avaliable
    {
        setBalance(getBalance() + d);       
        return getBalance();
    }

    public double withdraw(double w) //abstract method used for withdraw
    {
        if(getBalance() <25)
        {
            System.out.println("INSUFFICIENT BALANCE , ADD SOME MONEY");
        }
        else
        
            setBalance(getBalance() - w);
            return getBalance();
        
    }
}