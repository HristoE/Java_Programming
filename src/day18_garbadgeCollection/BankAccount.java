package day18_garbadgeCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public void checkBalance() {
        System.out.println("your available balance is $ " + balance);

    }
    public void deposit (double amount ){
        if(amount<1){
            System.out.println("Insufficient amount ");
            return;
        }
        System.out.println(
                "depositing $"+amount +"to "+accountNumber
        );
        balance += amount;
    }

    public void withdraw (double amount ){

        if(amount>balance){
            System.out.println(" Withraw amount is higher than the availible balance");
            return;
        }
        System.out.println("Withdraw $ "+ amount);
        balance -= amount;

    }

}






/*
2. Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance
			Actions:
				        1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	    5. withdraw(amount): decreases the balance by the specified amount
 */

