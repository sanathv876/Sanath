public class BankAccount {
    int myBankAccount = 122;

    public void depositMoney(int bankAccount, int deposit){
        myBankAccount+=deposit;
    }
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        BankAccount ba1 = new BankAccount();
        ba.depositMoney(12, 572);
        System.out.println(ba1.myBankAccount);
        System.out.println(ba.myBankAccount);
    }
}
