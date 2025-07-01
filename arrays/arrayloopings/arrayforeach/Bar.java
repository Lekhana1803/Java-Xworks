class Bar {
static String beers[] = {"KF Strong", "Budweiser Magnum", "Stout"};
static String cocktails[] = {"Margarita", "Old Fashioned", "Negroni"};
static String whisky[] = {"Johnnie Walker", "Jameson", "Jack Daniel's"};
public static void main(String[] bar) {
System.out.println("Beers:");
for (String name : beers) {
System.out.println(name);
}
System.out.println("Cocktails:");
for (String name : cocktails) {
System.out.println(name);
}
System.out.println("Whisky:");
for (String name : whisky) {
System.out.println(name);
}
}
}
