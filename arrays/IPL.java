class IPL {
    static String teamNames[] = {"RCB", "MI", "CSK", "KKR", "SRH", "DC", "RR", "LSG", "GT", "PBKS"};
    static String captains[] = {"Faf du Plessis", "Hardik Pandya", "MS Dhoni", "Shreyas Iyer", "Kane Williamson", "Rishabh Pant", "Sanju Samson", "KL Rahul", "Shubman Gill", "Shikhar Dhawan"};
    static String coaches[] = {"Sanjay Bangar", "Mark Boucher", "Stephen Fleming", "Chandrakant Pandit", "Tom Moody", "Ricky Ponting", "Kumar Sangakkara", "Andy Flower", "Ashish Nehra", "Trevor Bayliss"};
    static String homeGrounds[] = {"Chinnaswamy", "Wankhede", "Chepauk", "Eden Gardens", "Rajiv Gandhi Intl.", "Arun Jaitley", "Sawai Mansingh", "Ekana Stadium", "Narendra Modi Stadium", "IS Bindra Stadium"};
    static String owners[] = {"United Spirits", "Reliance", "India Cements", "Red Chillies", "Sun TV Network", "JSW & GMR", "Royal Multisport", "RPSG Group", "CVC Capital", "Preity Zinta"};
    static String colors[] = {"Red & Black", "Blue", "Yellow", "Purple & Gold", "Orange", "Blue & Red", "Pink", "Dark Blue", "Teal & Gold", "Red & Silver"};
    static String topBatsmen[] = {"Virat Kohli", "Rohit Sharma", "Ruturaj Gaikwad", "Nitish Rana", "Rahul Tripathi", "David Warner", "Jos Buttler", "Quinton de Kock", "David Miller", "Shikhar Dhawan"};
    static String topBowlers[] = {"Harshal Patel", "Jasprit Bumrah", "Deepak Chahar", "Sunil Narine", "Bhuvneshwar Kumar", "Anrich Nortje", "Yuzvendra Chahal", "Avesh Khan", "Mohammed Shami", "Arshdeep Singh"};
    static String titlesWon[] = {"0", "5", "5", "2", "1", "0", "1", "0", "1", "0"};
    static String yearEstablished[] = {"2008", "2008", "2008", "2008", "2013", "2008", "2008", "2022", "2022", "2008"};

    public static void main(String[] args) {
        System.out.println("Team Names: " + teamNames[0] + ", " + teamNames[1] + ", " + teamNames[2]);
        System.out.println("Length: " + teamNames.length);

        System.out.println("Captains: " + captains[0] + ", " + captains[1] + ", " + captains[2]);
        System.out.println("Length: " + captains.length);

        System.out.println("Coaches: " + coaches[0] + ", " + coaches[1] + ", " + coaches[2]);
        System.out.println("Length: " + coaches.length);

        System.out.println("Home Grounds: " + homeGrounds[0] + ", " + homeGrounds[1] + ", " + homeGrounds[2]);
        System.out.println("Length: " + homeGrounds.length);

        System.out.println("Owners: " + owners[0] + ", " + owners[1] + ", " + owners[2]);
        System.out.println("Length: " + owners.length);

        System.out.println("Colors: " + colors[0] + ", " + colors[1] + ", " + colors[2]);
        System.out.println("Length: " + colors.length);

        System.out.println("Top Batsmen: " + topBatsmen[0] + ", " + topBatsmen[1] + ", " + topBatsmen[2]);
        System.out.println("Length: " + topBatsmen.length);

        System.out.println("Top Bowlers: " + topBowlers[0] + ", " + topBowlers[1] + ", " + topBowlers[2]);
        System.out.println("Length: " + topBowlers.length);

        System.out.println("Titles Won: " + titlesWon[0] + ", " + titlesWon[1] + ", " + titlesWon[2]);
        System.out.println("Length: " + titlesWon.length);

        System.out.println("Year Established: " + yearEstablished[0] + ", " + yearEstablished[1] + ", " + yearEstablished[2]);
        System.out.println("Length: " + yearEstablished.length);
    }
}
