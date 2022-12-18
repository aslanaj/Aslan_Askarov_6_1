public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(70);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setNameOfWeapon("AK-47");
        bossWeapon.setWeaponType(WeaponType.GUNS);

        System.out.println("Boss info " + boss.info() + bossWeapon.infoWeapon());
    }
}