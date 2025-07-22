class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Weapon weapon = new Weapon();

        System.out.println("id of weapon = " + weapon.weaponId);
        System.out.println("name = " + weapon.name);
        System.out.println("type = " + weapon.type);
        System.out.println("weight = " + weapon.weight);
        System.out.println("length = " + weapon.length);
        System.out.println("material = " + weapon.material);
        System.out.println("licensed = " + weapon.licensed);

        weapon.weaponId = 10;
        weapon.name = "Katana";
        weapon.type = "Sword";
        weapon.weight = 1.2;
        weapon.length = 70.5;
        weapon.material = "Steel";
        weapon.licensed = true;

        System.out.println("id of weapon = " + weapon.weaponId);
        System.out.println("name = " + weapon.name);
        System.out.println("type = " + weapon.type);
        System.out.println("weight = " + weapon.weight);
        System.out.println("length = " + weapon.length);
        System.out.println("material = " + weapon.material);
        System.out.println("licensed = " + weapon.licensed);

        System.out.println("main ended");
    }
}
