package ATM;

public class withdrawal {
    public int withdrawal(int balance,int withdrawal_amount){
        if (balance<withdrawal_amount)
            throw new IllegalArgumentException("Balance is not sufficient");
        balance = balance-withdrawal_amount;
        return balance;
    }
    public int stub_withdrawal(int balance,int withdrawal_amount){
        return 1;
    }
}
