class Flipkart {
    static String userName;
    static String email;

    public static boolean registerUser(String name, String mail) {
        boolean isUserRegistered = false;
        boolean nameValid = false;
        boolean emailValid = false;

        if (name != null) {
            userName = name;
            nameValid = true;
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        }

        if (nameValid && emailValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
    }
}
