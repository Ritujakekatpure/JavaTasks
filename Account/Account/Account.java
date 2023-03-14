package Account;
public class Account{
    private long accountno;
    private String name;
    private String add;
    private long phoneno;
    private String dob;
    private double balance;

    public void setAccountno(long accountno)
    {
        this.accountno=accountno;
    }

    public long getAccountno()
    {
        return accountno;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setAdd(String add)
    {
        this.add=add;
    }

    public String getAdd()
    {
        return add;
    }
    
    public void setPhoneno(long phoneno)
    {
        this.phoneno=phoneno;
    }

    public long getPhoneno()
    {
        return phoneno;
    }

    public void setDob(String dob)
    {
        this.dob=dob;
    }

    public String getDob()
    {
        return dob;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public double getBalance()
    {
        return balance;
    }
   

    public void closeAccount()
    {
        System.out.println("Account is closed");
    }
}