class IccTeamsfor{
static String team1="india";
static String team2="australia";
static String team3="westindies";
static String team4="southafrica";
static String team5="england";
static String team6="pakistan";
static String team7="srilanka";
static String team8="zimbombay";
static String team9="newzland";
static String team10="afganistan";

static String iccteams[]={team1,team2,team3,team4,team5,team6,team7,team8,team9,team10};


public static void main(String[] args){
System.out.println("top 10 teams");
for(String icc:iccteams)
System.out.println(icc);

}

}