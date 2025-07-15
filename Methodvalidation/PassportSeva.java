class PassportSeva {
    static String givenName;
    static String surName;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String gName, String sName, String pwd, String cpwd) {
        boolean isUserRegistered = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean passwordValid = false;

        if (gName != null && !gName.isEmpty()) {
            givenName = gName;
            givenNameValid = true;
        } else {
            System.out.println("The given name is not valid");
        }

        if (sName != null && !sName.isEmpty()) {
            surName = sName;
            surNameValid = true;
        } else {
            System.out.println("The surname is not valid");
        }

        if (pwd != null && cpwd != null && !pwd.isEmpty() && pwd.equals(cpwd)) {
            password = pwd;
            confirmPassword = cpwd;
            passwordValid = true;
        } else {
            System.out.println("Password and Confirm Password are not valid or don't match");
        }

        if (givenNameValid && surNameValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The Given Name is: " + givenName);
        System.out.println("The Surname is: " + surName);
        System.out.println("The Password is: " + password);
        System.out.println("The Confirm Password is: " + confirmPassword);
    }
}