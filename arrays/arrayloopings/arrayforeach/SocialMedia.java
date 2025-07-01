class SocialMedia {
static String majorPlatforms[]= {"Facebook", "YouTube", "Instagram"};
static String messagingApps[]= {"WhatsApp", "Telegram", "Messenger"};
static String shortVideoApps[]= {"TikTok", "Snapchat"};
static String nichePlatforms[]= {"Pinterest", "LinkedIn"};
public static void main(String[] media) {
System.out.println("Major Platforms:");
for (String platform : majorPlatforms) {
System.out.println(platform);
}
System.out.println("Messaging Apps:");
for (String app : messagingApps) {
System.out.println(app);
}
System.out.println("Short Video Apps:");
for (String app : shortVideoApps) {
System.out.println(app);
}
System.out.println("Niche Platforms:");
for (String site : nichePlatforms) {
System.out.println(site);
}
}
}
