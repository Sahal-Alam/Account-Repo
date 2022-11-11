class Account{
    private int account_number;
    private double account_balance;
    Account()
    {
        account_number = 0;
        account_balance = 0;
    }
    Account (int account_number , double account_balance)
    {
        this.account_balance = account_balance;
        this.account_number = account_number;
    }
    public void setInput( int account_number , double account_balance)
    {
        this.account_number = account_number;
        this.account_balance = account_balance;
    }

    public void show_Data(){
        System.out.println("Account number : "+account_number);
        System.out.println("Account balance : "+account_balance);

    }

    public void deposit (double update_value){
        if(update_value < 0){
             System.out.println("Negative value shouldn't deposit");  
        }
        else
        account_balance = account_balance + update_value;
    }
}