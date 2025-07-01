class Hospital {
static String cardiologists[] = {"Dr. Ashok Seth","Dr. Devi Prasad Shetty","Dr. Naresh Trehan"};
static String specialists[] = {"Dr. Priyadarshi Ranjan","Dr. Randeep Guleria","Dr. D. Nageshwar Reddy","Dr. Abhideep Chaudhary","Dr. Subhash Gupta","Dr. Naresh Trehan Jr.","Dr. Deepak Namjoshi"};
public static void main(String[] hospital) {
System.out.println("Cardiologists:");
for (String doctor : cardiologists) {
System.out.println(doctor);
}
System.out.println("Specialists:");
for (String doctor : specialists) {
System.out.println(doctor);
}
}
}
