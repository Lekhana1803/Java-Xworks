public class VideoGames {
	
    public static String developer;
    public static String genre;
    public static boolean multiplayer;
    public static int releaseYear;
    public static String publisher;
    public static boolean hasDLC;
    public static String ESRBRating;
    public static boolean isVR;
    public static String languageSupport;
    public static boolean crossPlatform;
    public static int memoryGB;
    public static String saveFormat;
    public static String website;
    public static boolean hasSoundtrack;

    public static void main(String[] args) {
		System.out.println(developer);
		developer="riya";
		System.out.println(developer);
		
        System.out.println(genre);
		genre="rpg";
		System.out.println(genre);
		
		System.out.println(developer);
		multiplayer=true;
		System.out.println(multiplayer);
		
		System.out.println(releaseYear);
		releaseYear=2005;
		System.out.println(releaseYear);
		
		System.out.println(publisher);
		publisher="musk";
		System.out.println(publisher);

  		System.out.println(hasDLC);
		hasDLC=true;
		System.out.println(hasDLC);

		System.out.println(ESRBRating);
		ESRBRating="T";
		System.out.println(ESRBRating);

		System.out.println(isVR);
		isVR=true;
		System.out.println(isVR);
		
		System.out.println(languageSupport);
		languageSupport="eng,kan";
		System.out.println(languageSupport);
		
		System.out.println(crossPlatform);
		crossPlatform=true;
		System.out.println(crossPlatform);


		System.out.println(memoryGB);
		memoryGB=50;
		System.out.println(memoryGB);

		System.out.println(saveFormat);
		saveFormat="cloud";
		System.out.println(saveFormat);

		System.out.println(website);
		website="lekhana@gmail.com";
		System.out.println(website);

		System.out.println(hasSoundtrack);
		hasSoundtrack=true;
		System.out.println(hasSoundtrack);


		//declaration and initiatization
		double priceUSD = 59.99;
		System.out.println("priceUSD = " + priceUSD);
		//re init/updating
		priceUSD=80.59;
		System.out.println(" updatedpriceUSD = " + priceUSD);
		
		double rating = 4.7;
		System.out.println("rating = " + rating);
		rating=8.5;
		System.out.println("updated rating = " + rating);
		
        
    }
}
