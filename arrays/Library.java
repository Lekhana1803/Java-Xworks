class Library {
    static String fictionBooks[] = {"To Kill a Mockingbird", "1984", "The Great Gatsby", "The Alchemist", "Pride and Prejudice", "The Catcher in the Rye", "Jane Eyre", "Little Women"};
    static String nonFictionBooks[] = {"Sapiens", "Educated", "Atomic Habits", "Becoming", "The Power of Habit", "Ikigai", "Thinking, Fast and Slow", "The 5 AM Club"};
    static String scienceBooks[] = {"A Brief History of Time", "The Selfish Gene", "Cosmos", "The Origin of Species", "The Elegant Universe", "The Gene", "Astrophysics for People in a Hurry", "Surely You're Joking, Mr. Feynman!"};
    static String historyBooks[] = {"India After Gandhi", "Guns, Germs, and Steel", "The Discovery of India", "The Silk Roads", "A People's History of the United States", "Ancient Civilizations", "The Wright Brothers", "Team of Rivals"};
    static String biographyBooks[] = {"Steve Jobs", "Long Walk to Freedom", "Wings of Fire", "I Am Malala", "The Diary of a Young Girl", "Elon Musk", "Sachin: Playing It My Way", "My Experiments with Truth"};
    static String technologyBooks[] = {"Clean Code", "The Pragmatic Programmer", "Introduction to Algorithms", "Code Complete", "Python Crash Course", "Artificial Intelligence: A Modern Approach", "Data Structures in Java", "Design Patterns"};
    static String childrenBooks[] = {"Harry Potter", "The Jungle Book", "Charlie and the Chocolate Factory", "The Lion, the Witch and the Wardrobe", "Alice in Wonderland", "Matilda", "The Little Prince", "Geronimo Stilton"};
    static String literatureBooks[] = {"Hamlet", "Macbeth", "The Odyssey", "The Iliad", "War and Peace", "Les Misérables", "Crime and Punishment", "Don Quixote"};

    public static void main(String[] args) {
        System.out.println("Fiction Books: " + fictionBooks[0] + ", " + fictionBooks[1] + ", " + fictionBooks[2]);
        System.out.println("Length: " + fictionBooks.length);

        System.out.println("Non-Fiction Books: " + nonFictionBooks[0] + ", " + nonFictionBooks[1] + ", " + nonFictionBooks[2]);
        System.out.println("Length: " + nonFictionBooks.length);

        System.out.println("Science Books: " + scienceBooks[0] + ", " + scienceBooks[1] + ", " + scienceBooks[2]);
        System.out.println("Length: " + scienceBooks.length);

        System.out.println("History Books: " + historyBooks[0] + ", " + historyBooks[1] + ", " + historyBooks[2]);
        System.out.println("Length: " + historyBooks.length);

        System.out.println("Biography Books: " + biographyBooks[0] + ", " + biographyBooks[1] + ", " + biographyBooks[2]);
        System.out.println("Length: " + biographyBooks.length);

        System.out.println("Technology Books: " + technologyBooks[0] + ", " + technologyBooks[1] + ", " + technologyBooks[2]);
        System.out.println("Length: " + technologyBooks.length);

        System.out.println("Children Books: " + childrenBooks[0] + ", " + childrenBooks[1] + ", " + childrenBooks[2]);
        System.out.println("Length: " + childrenBooks.length);

        System.out.println("Literature Books: " + literatureBooks[0] + ", " + literatureBooks[1] + ", " + literatureBooks[2]);
        System.out.println("Length: " + literatureBooks.length);
    }
}
