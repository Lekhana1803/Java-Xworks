
class PassportSevaRunner
{
public static void main(String args[])
{
boolean userRegistered=PassportSeva.registerUser("sushma","yadav","sush@123","sush@123");
System.out.println("Is the userRegistered"+ userRegistered);
if (userRegistered==true)
PassportSeva.getUserInfo();
}
}