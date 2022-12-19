public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(70);


        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.GUNS);
        bossWeapon.setNameOfWeapon("AK-47");
        /*
        Weapon bossWeapon = new Weapon();
        bossWeapon.setNameOfWeapon("AK-47");
        bossWeapon.setWeaponType(WeaponType.GUNS);

         */

        System.out.println("Boss info " + boss.info()
                + bossWeapon.infoWeapon());


        Boss boss1 = new Boss();
        boss1.setHealth(1000);
        boss1.setDamage(100);

        System.out.println(boss1.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(800);
        skeleton.setDamage(80);
        skeleton.setNumberOfArrows(20);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(700);
        skeleton1.setDamage(70);
        skeleton1.setNumberOfArrows(15);

        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());
    }
}