public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance){

        balance=initialBalance;

    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient funds.");
        } else{
            balance-=amount;
        }
    }


    public static void main(String[] args){


        BankAccount obj=new BankAccount(1000);
        System.out.println("Opening balance: "+obj.getBalance());
        obj.deposit(500);
        System.out.println("New balance: "+obj.getBalance());
        obj.withdraw(200);
        System.out.println("New balance: "+obj.getBalance());
    }
}