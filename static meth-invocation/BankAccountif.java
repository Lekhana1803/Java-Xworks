class BankAccountif{

static double balance;


public static void debit(double amount){
System.out.println("debit started");
boolean check=amount<0.00;

if(check){
balance=balance-amount;
System.out.println(balance);
}
else
{
System.out.println("insufficient");
}
System.out.println("debit ended");
}

public static void credit(double amount){
System.out.println("credit started");
boolean check=amount>0.00;

if(check){
balance=balance+amount;
System.out.println(balance);
}
else
{
System.out.println("insufficient");
}
System.out.println("credit ended");
return;
}

}