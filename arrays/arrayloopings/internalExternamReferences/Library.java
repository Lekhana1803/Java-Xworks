class Library {

    // Fiction Books
    static String fic1 = "To Kill a Mockingbird";
    static String fic2 = "1984";
    static String fic3 = "The Great Gatsby";
    static String fic4 = "The Alchemist";
    static String fic5 = "Pride and Prejudice";
    static String fic6 = "The Catcher in the Rye";
    static String fic7 = "Jane Eyre";
    static String fic8 = "Little Women";
    static String[] fictionBooks = {
        fic1, fic2, fic3, fic4,
        fic5, fic6, fic7, fic8
    };

    // Non-Fiction Books
    static String non1 = "Sapiens";
    static String non2 = "Educated";
    static String non3 = "Atomic Habits";
    static String non4 = "Becoming";
    static String non5 = "The Power of Habit";
    static String non6 = "Ikigai";
    static String non7 = "Thinking, Fast and Slow";
    static String non8 = "The 5 AM Club";
    static String[] nonFictionBooks = {
        non1, non2, non3, non4,
        non5, non6, non7, non8
    };

    // Science Books
    static String sci1 = "A Brief History of Time";
    static String sci2 = "The Selfish Gene";
    static String sci3 = "Cosmos";
    static String sci4 = "The Origin of Species";
    static String sci5 = "The Elegant Universe";
    static String sci6 = "The Gene";
    static String sci7 = "Astrophysics for People in a Hurry";
    static String sci8 = "Surely You're Joking, Mr. Feynman!";
    static String[] scienceBooks = {
        sci1, sci2, sci3, sci4,
        sci5, sci6, sci7, sci8
    };

    // History Books
    static String his1 = "India After Gandhi";
    static String his2 = "Guns, Germs, and Steel";
    static String his3 = "The Discovery of India";
    static String his4 = "The Silk Roads";
    static String his5 = "A People's History of the United States";
    static String his6 = "Ancient Civilizations";
    static String his7 = "The Wright Brothers";
    static String his8 = "Team of Rivals";
    static String[] historyBooks = {
        his1, his2, his3, his4,
        his5, his6, his7, his8
    };

    // Biography Books
    static String bio1 = "Steve Jobs";
    static String bio2 = "Long Walk to Freedom";
    static String bio3 = "Wings of Fire";
    static String bio4 = "I Am Malala";
    static String bio5 = "The Diary of a Young Girl";
    static String bio6 = "Elon Musk";
    static String bio7 = "Sachin: Playing It My Way";
    static String bio8 = "My Experiments with Truth";
    static String[] biographyBooks = {
        bio1, bio2, bio3, bio4,
        bio5, bio6, bio7, bio8
    };

    // Technology Books
    static String tech1 = "Clean Code";
    static String tech2 = "The Pragmatic Programmer";
    static String tech3 = "Introduction to Algorithms";
    static String tech4 = "Code Complete";
    static String tech5 = "Python Crash Course";
    static String tech6 = "Artificial Intelligence: A Modern Approach";
    static String tech7 = "Data Structures in Java";
    static String tech8 = "Design Patterns";
    static String[] technologyBooks = {
        tech1, tech2, tech3, tech4,
        tech5, tech6, tech7, tech8
    };

    // Children Books
    static String child1 = "Harry Potter";
    static String child2 = "The Jungle Book";
    static String child3 = "Charlie and the Chocolate Factory";
    static String child4 = "The Lion, the Witch and the Wardrobe";
    static String child5 = "Alice in Wonderland";
    static String child6 = "Matilda";
    static String child7 = "The Little Prince";
    static String child8 = "Geronimo Stilton";
    static String[] childrenBooks = {
        child1, child2, child3, child4,
        child5, child6, child7, child8
    };

    // Literature Books
    static String lit1 = "Hamlet";
    static String lit2 = "Macbeth";
    static String lit3 = "The Odyssey";
    static String lit4 = "The Iliad";
    static String lit5 = "War and Peace";
    static String lit6 = "Les Misérables";
    static String lit7 = "Crime and Punishment";
    static String lit8 = "Don Quixote";
    static String[] literatureBooks = {
        lit1, lit2, lit3, lit4,
        lit5, lit6, lit7, lit8
    };

    public static void main(String[] args) {
        System.out.println("Fiction Books:");
        for (String book : fictionBooks) System.out.println(book);

        System.out.println("\nNon-Fiction Books:");
        for (String book : nonFictionBooks) System.out.println(book);

        System.out.println("\nScience Books:");
        for (String book : scienceBooks) System.out.println(book);

        System.out.println("\nHistory Books:");
        for (String book : historyBooks) System.out.println(book);

        System.out.println("\nBiography Books:");
        for (String book : biographyBooks) System.out.println(book);

        System.out.println("\nTechnology Books:");
        for (String book : technologyBooks) System.out.println(book);

        System.out.println("\nChildren Books:");
        for (String book : childrenBooks) System.out.println(book);

        System.out.println("\nLiterature Books:");
        for (String book : literatureBooks) System.out.println(book);
    }
}
