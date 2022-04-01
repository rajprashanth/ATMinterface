import java.util.Scanner;

public class ATM_interface2 {
 
	public static String BankName="SBI ATM";
	public String name;
	public double balance;
	
     ATM_interface2 (String name)
	{
		this.name=name;
	}
     public void deposit(double amount)
     {
    	this.balance=this.balance+amount;
    	System.out.println("AFTER DEPOSIT BALANCE IS  "+this.balance);
     }
     public void withdraw(double amount)
     {
    	if(amount>balance)
    	{
    		System.out.println("SORRY...INSUFFICIENT FUNDS");
    		System.exit(0);
    	}
    	else
    	{
    		this.balance=this.balance-amount;
    		System.out.println("AFTER WITHDRAW THE BALANCE: "+this.balance);
    	}
     }
     public void getBalance(double amount) {
         System.out.println("YOUR AVALIABLE BALANCE: "+this.balance);
         }
	public static void main(String[] args) {
		System.out.println("WELCOME TO SBI ATM"+ATM_interface2.BankName);
		Scanner sc= new Scanner(System.in);
		System.out.print("ENTER YOUR NAME: ");
		String name=sc.next();
		ATM_interface2 a= new ATM_interface2(name);
		System.out.println("HELLO  "  +  a.name  +  "  YOUR ACCOUNT INFO");
		int pin=1234;
		System.out.print("ENTER YOUR PIN: ");
		
		int entry = sc.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = sc.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	
		while(true)
		{
		System.out.println("CHOOSE YOUR OPTION TO PERFORM");
		System.out.println("D-DEPOSIT");
		System.out.println("W-WITHDRAW");
		System.out.println("C-CHECK BALANCE");
		System.out.println("E-EXIST");
		String option =sc.next();
		if(option.equalsIgnoreCase("D"))
		{
			System.out.println("ENTER AMOUNT: ");
			double amount=sc.nextDouble();
			a.deposit(amount); 
			}
		else if(option.equalsIgnoreCase("W"))
		{
		     System.out.println("ENTER AMOUNT TO WITHDRAW: ");
		     double amount=sc.nextDouble();
		     a.withdraw(amount);
		}
		else if(option.equalsIgnoreCase("C"))
		{
			System.out.println("YOUR AVALIABLE BALANCE IS");
			double amount=sc.nextDouble();
			a.getBalance(amount);
		}
		else if(option.equalsIgnoreCase("E"))
		{
			System.out.println("THANKS FOR BANKING");
			System.exit(0);
		}
		else
		{
			System.out.println("INVALID OPTION...Plzz CHOOSE VALID OPTION");
		}
	}
  }
}
