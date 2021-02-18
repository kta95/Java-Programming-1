
public class YourFirstAccount {

    public static void main(String[] args) {
        Account myAcc = new Account("My account", 100.00);
        System.out.println("Intial state");
        System.out.println(myAcc);

        myAcc.deposit(20.0);
        System.out.println("The balance of account is now: " + myAcc);

        System.out.println("End state");
        System.out.println(myAcc);
    }
}
