package src;

public class Account {
    private long accountNo;
    private long amount;
    private long nationalID;

    public Account() {}

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getNationalID() {
        return nationalID;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            throw new NotEnoughMoneyException("Not enough money!");
        }
    }

    public void linkToNationalID(long nationalID) throws InvalidNationalIdException{
        int count = 0;
        long checkID = nationalID;

        for (; checkID != 0; checkID /= 10, ++count);

        if (count != 13) {
            throw new InvalidNationalIdException("Invalid CNP, go to jail!");
        } else {
            this.nationalID = nationalID;
            System.out.println("ID [" + nationalID + "] successfully linked!");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", nationalID=" + nationalID +
                '}';
    }
}
