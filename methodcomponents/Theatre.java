class Theatre {
    public static void reserve(String movie, int tickets) {
        System.out.println("Seats reserved for " + movie);
        Printer.print(movie, tickets);
    }
}

