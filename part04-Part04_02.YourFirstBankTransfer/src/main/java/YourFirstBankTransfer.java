
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Macc=new Account("Matthews account",1000.0);
        Account myacc=new Account("My account",0.0);
        Macc.withdrawal(100.0);
        myacc.deposit(100.0);
        
        System.out.println(Macc);
        System.out.println(myacc);
        
    }
}
