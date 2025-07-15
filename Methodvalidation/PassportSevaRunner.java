
class PassportSevaRunner
{
public static void main(String args[])
{
boolean userRegistered=PassportSeva.registerUser("lekhana","im","lekhana@123","lekhana@123");
System.out.println("Is the userRegistered"+ userRegistered);
if (userRegistered==true)
PassportSeva.getUserInfo();
}
}