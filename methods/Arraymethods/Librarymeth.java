class Librarymeth {
static String fiction[] = {"To Kill a Mockingbird", "1984", "The Great Gatsby"};
static String nonFiction[] = {"Sapiens", "Educated", "The Wright Brothers"};
static String mystery[] = {"Gone Girl", "The Girl with the Dragon Tattoo", "In the Woods"};

public static void main(String[] library) {
System.out.println("Fiction Books:");
for (String book : fiction) {
System.out.println(book);
}
System.out.println("Non-Fiction Books:");
for (String book : nonFiction) {
System.out.println(book);
}
System.out.println("Mystery Books:");
for (String book : mystery) {
System.out.println(book);
}

}
}
