public class IndianBank
{
    int accountnum = 123456;
    double balance = 50000;
    String name="Mohamed";
    int pin=2000;



    public IndianBank() {
        super();
    }

    public IndianBank(int accountnum, double balance, String name) {
        super();
        this.accountnum = accountnum;
        this.balance = balance;
        this.name = name;
    }

    public int getaccountnum() {
        return accountnum;
    }

    public void setaccountnum(int accountnum) {
        this.accountnum= accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IndianBank [accountnum=" + accountnum+ ", balance=" + balance + ", name=" + name + "]";
    }

}






















