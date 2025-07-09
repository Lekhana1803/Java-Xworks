class HospitalRunner1{

public static void main(String appolo[]){
System.out.println("main stred");

//invoking meth/functionality/behaviour

String patientName="radha";
int age=19;
long contactNum=3213223233l;
String email="sahgda@gmail.com";
/*String disease="fever";*/
Hospital1.checkup(patientName,age,contactNum,email,"fever");

System.out.println("main ended");


}
}