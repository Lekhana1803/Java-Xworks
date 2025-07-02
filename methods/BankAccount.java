class BankAccount{

static double balance;

public static void main(String[] accounts){
	System.out.println("main started");
	credit(1000.0);//parameter
	System.out.println("current balance:"+balance);
	System.out.println("main ended");

}

//debit
//credit
//transfer

//dat varname-parameter
//access specifier return type methname(parameter)

public static void debit(double amount){
System.out.println("debit started");	
balance=balance-amount;
System.out.println("debit ended");
}

public static void credit(double amount){
System.out.println("credit started");
balance=balance+amount;
System.out.println("credit ended");
}

}