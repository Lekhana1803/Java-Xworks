class Library {
static String fiction[] = {"To Kill a Mockingbird", "1984", "The Great Gatsby"};
static String nonFiction[] = {"Sapiens", "Educated", "The Wright Brothers"};
static String mystery[] = {"Gone Girl", "The Girl with the Dragon Tattoo", "In the Woods"};
static String sciFi[] = {"Dune", "Neuromancer", "Ender's Game"};
static String fantasy[] = {"The Hobbit", "Harry Potter", "Mistborn"};
static String biography[] = {"Steve Jobs", "Alexander Hamilton", "Becoming"};
static String selfHelp[] = {"Atomic Habits", "The Power of Habit", "How to Win Friends"};
static String classics[] = {"Pride and Prejudice", "Moby Dick", "War and Peace"};
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
System.out.println("Science Fiction Books:");
for (String book : sciFi) {
System.out.println(book);
}
System.out.println("Fantasy Books:");
for (String book : fantasy) {
System.out.println(book);
}
System.out.println("Biographies:");
for (String book : biography) {
System.out.println(book);
}
System.out.println("Self-Help Books:");
for (String book : selfHelp) {
System.out.println(book);
}
System.out.println("Classics:");
for (String book : classics) {
System.out.println(book);
}
}
}
