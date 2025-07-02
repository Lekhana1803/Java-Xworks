class Operators{


public static void main(String [] add){
	add(12,13);
	add(25,35);
	
	mul(12,13);
	mul(25,35);
	
	sub(12,13);
	sub(25,35);
	
	mod(12,13);
	mod(25,35);
	
	div(12,13);
	div(100,2);
	
}
public static void add(int num1, int num2){
int total=num1+num2;
System.out.println(total);

}
public static void mul(int num1,int num2){
int total=num1*num2;
System.out.println(total);

}

public static void sub(int num1,int num2){
int total=num1-num2;
System.out.println(total);

}
public static void mod(int num1, int num2){
int total=num1%num2;
System.out.println(total);

}

public static void div(int num1, int num2){
int total=num1/num2;
System.out.println("division of two numbers are: "+total);

}
}