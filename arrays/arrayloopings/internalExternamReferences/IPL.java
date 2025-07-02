class IPL {

    // Team Names
    static String team1 = "RCB";
    static String team2 = "MI";
    static String team3 = "CSK";
    static String team4 = "KKR";
    static String team5 = "SRH";
    static String team6 = "DC";
    static String team7 = "RR";
    static String team8 = "LSG";
    static String team9 = "GT";
    static String team10 = "PBKS";
    static String[] teamNames = {
        team1, team2, team3, team4, team5,
        team6, team7, team8, team9, team10
    };

    // Captains
    static String captain1 = "Faf du Plessis";
    static String captain2 = "Hardik Pandya";
    static String captain3 = "MS Dhoni";
    static String captain4 = "Shreyas Iyer";
    static String captain5 = "Kane Williamson";
    static String captain6 = "Rishabh Pant";
    static String captain7 = "Sanju Samson";
    static String captain8 = "KL Rahul";
    static String captain9 = "Shubman Gill";
    static String captain10 = "Shikhar Dhawan";
    static String[] captains = {
        captain1, captain2, captain3, captain4, captain5,
        captain6, captain7, captain8, captain9, captain10
    };

    // Coaches
    static String coach1 = "Sanjay Bangar";
    static String coach2 = "Mark Boucher";
    static String coach3 = "Stephen Fleming";
    static String coach4 = "Chandrakant Pandit";
    static String coach5 = "Tom Moody";
    static String coach6 = "Ricky Ponting";
    static String coach7 = "Kumar Sangakkara";
    static String coach8 = "Andy Flower";
    static String coach9 = "Ashish Nehra";
    static String coach10 = "Trevor Bayliss";
    static String[] coaches = {
        coach1, coach2, coach3, coach4, coach5,
        coach6, coach7, coach8, coach9, coach10
    };

    // Home Grounds
    static String ground1 = "Chinnaswamy";
    static String ground2 = "Wankhede";
    static String ground3 = "Chepauk";
    static String ground4 = "Eden Gardens";
    static String ground5 = "Rajiv Gandhi Intl.";
    static String ground6 = "Arun Jaitley";
    static String ground7 = "Sawai Mansingh";
    static String ground8 = "Ekana Stadium";
    static String ground9 = "Narendra Modi Stadium";
    static String ground10 = "IS Bindra Stadium";
    static String[] homeGrounds = {
        ground1, ground2, ground3, ground4, ground5,
        ground6, ground7, ground8, ground9, ground10
    };

    // Owners
    static String owner1 = "United Spirits";
    static String owner2 = "Reliance";
    static String owner3 = "India Cements";
    static String owner4 = "Red Chillies";
    static String owner5 = "Sun TV Network";
    static String owner6 = "JSW & GMR";
    static String owner7 = "Royal Multisport";
    static String owner8 = "RPSG Group";
    static String owner9 = "CVC Capital";
    static String owner10 = "Preity Zinta";
    static String[] owners = {
        owner1, owner2, owner3, owner4, owner5,
        owner6, owner7, owner8, owner9, owner10
    };

    // Team Colors
    static String color1 = "Red & Black";
    static String color2 = "Blue";
    static String color3 = "Yellow";
    static String color4 = "Purple & Gold";
    static String color5 = "Orange";
    static String color6 = "Blue & Red";
    static String color7 = "Pink";
    static String color8 = "Dark Blue";
    static String color9 = "Teal & Gold";
    static String color10 = "Red & Silver";
    static String[] colors = {
        color1, color2, color3, color4, color5,
        color6, color7, color8, color9, color10
    };

    // Top Batsmen
    static String batsman1 = "Virat Kohli";
    static String batsman2 = "Rohit Sharma";
    static String batsman3 = "Ruturaj Gaikwad";
    static String batsman4 = "Nitish Rana";
    static String batsman5 = "Rahul Tripathi";
    static String batsman6 = "David Warner";
    static String batsman7 = "Jos Buttler";
    static String batsman8 = "Quinton de Kock";
    static String batsman9 = "David Miller";
    static String batsman10 = "Shikhar Dhawan";
    static String[] topBatsmen = {
        batsman1, batsman2, batsman3, batsman4, batsman5,
        batsman6, batsman7, batsman8, batsman9, batsman10
    };

    // Top Bowlers
    static String bowler1 = "Harshal Patel";
    static String bowler2 = "Jasprit Bumrah";
    static String bowler3 = "Deepak Chahar";
    static String bowler4 = "Sunil Narine";
    static String bowler5 = "Bhuvneshwar Kumar";
    static String bowler6 = "Anrich Nortje";
    static String bowler7 = "Yuzvendra Chahal";
    static String bowler8 = "Avesh Khan";
    static String bowler9 = "Mohammed Shami";
    static String bowler10 = "Arshdeep Singh";
    static String[] topBowlers = {
        bowler1, bowler2, bowler3, bowler4, bowler5,
        bowler6, bowler7, bowler8, bowler9, bowler10
    };

    // Titles Won
    static String title1 = "0";
    static String title2 = "5";
    static String title3 = "5";
    static String title4 = "2";
    static String title5 = "1";
    static String title6 = "0";
    static String title7 = "1";
    static String title8 = "0";
    static String title9 = "1";
    static String title10 = "0";
    static String[] titlesWon = {
        title1, title2, title3, title4, title5,
        title6, title7, title8, title9, title10
    };

    // Year Established
    static String year1 = "2008";
    static String year2 = "2008";
    static String year3 = "2008";
    static String year4 = "2008";
    static String year5 = "2013";
    static String year6 = "2008";
    static String year7 = "2008";
    static String year8 = "2022";
    static String year9 = "2022";
    static String year10 = "2008";
    static String[] yearEstablished = {
        year1, year2, year3, year4, year5,
        year6, year7, year8, year9, year10
    };

    public static void main(String[] args) {
        System.out.println("Team Names:");
        for (String team : teamNames) System.out.println(team);

        System.out.println("\nCaptains:");
        for (String cap : captains) System.out.println(cap);

        System.out.println("\nCoaches:");
        for (String coach : coaches) System.out.println(coach);

        System.out.println("\nHome Grounds:");
        for (String ground : homeGrounds) System.out.println(ground);

        System.out.println("\nOwners:");
        for (String owner : owners) System.out.println(owner);

        System.out.println("\nColors:");
        for (String color : colors) System.out.println(color);

        System.out.println("\nTop Batsmen:");
        for (String batsman : topBatsmen) System.out.println(batsman);

        System.out.println("\nTop Bowlers:");
        for (String bowler : topBowlers) System.out.println(bowler);

        System.out.println("\nTitles Won:");
        for (String title : titlesWon) System.out.println(title);

        System.out.println("\nYear Established:");
        for (String year : yearEstablished) System.out.println(year);
    }
}
