package src;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException {
        Account me = new Account();

        me.setAccountNo(15);
        me.setAmount(100);
        me.withdraw(90);

        me.linkToNationalID(2806998410020L);
        System.out.println(me);
    }
}
