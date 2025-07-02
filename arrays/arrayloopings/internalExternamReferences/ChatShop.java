class ChatShop {

    // Pani Puris
    static String pani1 = "Mumbai Pani Puri";
    static String pani2 = "Delhi Golgappa";
    static String pani3 = "Masala Pani Puri";
    static String pani4 = "Sweet Pani Puri";
    static String pani5 = "Spicy Pani Puri";
    static String pani6 = "Mint Pani Puri";
    static String pani7 = "Sukha Puri";
    static String pani8 = "Ragda Pani Puri";
    static String[] paniPuris = {
        pani1, pani2, pani3, pani4,
        pani5, pani6, pani7, pani8
    };

    // Bhel Puris
    static String bhel1 = "Sev Bhel";
    static String bhel2 = "Dry Bhel";
    static String bhel3 = "Mumbai Bhel";
    static String bhel4 = "Kolkata Bhel";
    static String bhel5 = "Green Chutney Bhel";
    static String bhel6 = "Sweet Bhel";
    static String bhel7 = "Crispy Bhel";
    static String bhel8 = "Corn Bhel";
    static String[] bhelPuriss = {
        bhel1, bhel2, bhel3, bhel4,
        bhel5, bhel6, bhel7, bhel8
    };

    // Samosas
    static String samosa1 = "Aloo Samosa";
    static String samosa2 = "Paneer Samosa";
    static String samosa3 = "Cheese Samosa";
    static String samosa4 = "Chinese Samosa";
    static String samosa5 = "Mix Veg Samosa";
    static String samosa6 = "Mini Samosa";
    static String samosa7 = "Spicy Samosa";
    static String samosa8 = "Sweet Samosa";
    static String[] samosas = {
        samosa1, samosa2, samosa3, samosa4,
        samosa5, samosa6, samosa7, samosa8
    };

    // Kachoris
    static String kachori1 = "Rajasthani Kachori";
    static String kachori2 = "Moong Dal Kachori";
    static String kachori3 = "Onion Kachori";
    static String kachori4 = "Matar Kachori";
    static String kachori5 = "Dry Fruit Kachori";
    static String kachori6 = "Sweet Kachori";
    static String kachori7 = "Spicy Kachori";
    static String kachori8 = "Gujarati Kachori";
    static String[] kachoris = {
        kachori1, kachori2, kachori3, kachori4,
        kachori5, kachori6, kachori7, kachori8
    };

    // Chole Items
    static String chole1 = "Chole Bhature";
    static String chole2 = "Chole Tikki";
    static String chole3 = "Chole Kulche";
    static String chole4 = "Chole Rice";
    static String chole5 = "Spicy Chole";
    static String chole6 = "Dry Chole";
    static String chole7 = "Chole Samosa";
    static String chole8 = "Chole Chaat";
    static String[] choleItems = {
        chole1, chole2, chole3, chole4,
        chole5, chole6, chole7, chole8
    };

    // Tikkis
    static String tikki1 = "Aloo Tikki";
    static String tikki2 = "Paneer Tikki";
    static String tikki3 = "Hara Bhara Tikki";
    static String tikki4 = "Corn Tikki";
    static String tikki5 = "Stuffed Tikki";
    static String tikki6 = "Crispy Tikki";
    static String tikki7 = "Sweet Tikki";
    static String tikki8 = "Spicy Tikki";
    static String[] tikkis = {
        tikki1, tikki2, tikki3, tikki4,
        tikki5, tikki6, tikki7, tikki8
    };

    // Pav Items
    static String pav1 = "Pav Bhaji";
    static String pav2 = "Masala Pav";
    static String pav3 = "Cheese Pav Bhaji";
    static String pav4 = "Butter Pav Bhaji";
    static String pav5 = "Jain Pav Bhaji";
    static String pav6 = "Paneer Pav Bhaji";
    static String pav7 = "Spicy Pav";
    static String pav8 = "Tawa Pav";
    static String[] pavItems = {
        pav1, pav2, pav3, pav4,
        pav5, pav6, pav7, pav8
    };

    // Special Chats
    static String special1 = "Dahi Puri";
    static String special2 = "Raj Kachori";
    static String special3 = "Papdi Chaat";
    static String special4 = "Samosa Chaat";
    static String special5 = "Tikki Chaat";
    static String special6 = "Chole Chaat";
    static String special7 = "Mix Chaat";
    static String special8 = "Fruit Chaat";
    static String[] specialChats = {
        special1, special2, special3, special4,
        special5, special6, special7, special8
    };

    public static void main(String[] args) {
        System.out.println("Pani Puris:");
        for (String item : paniPuris) {
            System.out.println(item);
        }

        System.out.println("\nBhel Puris:");
        for (String item : bhelPuriss) {
            System.out.println(item);
        }

        System.out.println("\nSamosas:");
        for (String item : samosas) {
            System.out.println(item);
        }

        System.out.println("\nKachoris:");
        for (String item : kachoris) {
            System.out.println(item);
        }

        System.out.println("\nChole Items:");
        for (String item : choleItems) {
            System.out.println(item);
        }

        System.out.println("\nTikkis:");
        for (String item : tikkis) {
            System.out.println(item);
        }

        System.out.println("\nPav Items:");
        for (String item : pavItems) {
            System.out.println(item);
        }

        System.out.println("\nSpecial Chats:");
        for (String item : specialChats) {
            System.out.println(item);
        }
    }
}
