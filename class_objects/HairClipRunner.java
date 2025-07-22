class HairClipRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        HairClip clip = new HairClip(); // default values

        System.out.println("id of hair clip = " + clip.clipId);
        System.out.println("brand of hair clip = " + clip.brand);
        System.out.println("color of hair clip = " + clip.color);
        System.out.println("material of hair clip = " + clip.material);
        System.out.println("price of hair clip = " + clip.price);
        System.out.println("size of hair clip = " + clip.size);
        System.out.println("is decorative = " + clip.decorative);

        clip.clipId = 3;
        clip.brand = "PrettyClip";
        clip.color = "Pink";
        clip.material = "Plastic";
        clip.price = 15.99;
        clip.size = "Medium";
        clip.decorative = true;

        System.out.println("id of hair clip = " + clip.clipId);
        System.out.println("brand of hair clip = " + clip.brand);
        System.out.println("color of hair clip = " + clip.color);
        System.out.println("material of hair clip = " + clip.material);
        System.out.println("price of hair clip = " + clip.price);
        System.out.println("size of hair clip = " + clip.size);
        System.out.println("is decorative = " + clip.decorative);

        System.out.println("main ended");
    }
}
