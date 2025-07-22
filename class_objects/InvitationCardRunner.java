class InvitationCardRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        InvitationCard card = new InvitationCard();

        System.out.println("id of card = " + card.cardId);
        System.out.println("occasion = " + card.occasion);
        System.out.println("color = " + card.color);
        System.out.println("material = " + card.material);
        System.out.println("sender = " + card.sender);
        System.out.println("receiver = " + card.receiver);
        System.out.println("date = " + card.date);

        card.cardId = 8;
        card.occasion = "Wedding";
        card.color = "Red";
        card.material = "Glossy Paper";
        card.sender = "Ravi";
        card.receiver = "Family Friends";
        card.date = "25-Dec-2025";

        System.out.println("id of card = " + card.cardId);
        System.out.println("occasion = " + card.occasion);
        System.out.println("color = " + card.color);
        System.out.println("material = " + card.material);
        System.out.println("sender = " + card.sender);
        System.out.println("receiver = " + card.receiver);
        System.out.println("date = " + card.date);

        System.out.println("main ended");
    }
}
