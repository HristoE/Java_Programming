package day18_garbadgeCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Hristo",1323342424);
        System.out.println(obj1);
        obj1.deposit(10000);

        obj1.checkBalance();

        obj1.withdraw(2000);






    }
}
