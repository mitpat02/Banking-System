public  abstract class BankAccount  //abstract class,superclass
{
    private  double balance;  //private datafield
    private  double annualRate;
    public double number_withdraw;
    public double number_deposit;
    public double monthlyServiceCharge;

    public BankAccount(double balance,double annualRate)//arg constructor 
    {
        setBalance(balance);
        setAnnualRate(annualRate);
    }
   
    //**getter and setter used to access private datatype balance */
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getAnnualRate()
    {
        return this.annualRate;
    }
    public void setAnnualRate(double annualRate)
    {
        this.annualRate = annualRate;
    }

    //**method calInterest() made to calculate the interest  */
    public double calcInterest()
    {
        double monthlyinterestRate = (annualRate / 12);
        double monthlyInterest = balance *  monthlyinterestRate;
        double Balance = balance +  monthlyInterest;
        return Balance;
    }
    
   /*public void monthlyProcess()
   {
       balance = balance - 1;
       calacInterest();
   }

    //**both abstract class methods */
    public abstract double deposit(double d);
    public abstract double withdraw(double w);
    
   
}