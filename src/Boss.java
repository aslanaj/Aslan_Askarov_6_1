public class Boss extends GameEntity {

    public Weapon bossWeapon(){

        Weapon bossW = new Weapon();
        bossW.setNameOfWeapon("Thunder ");
        bossW.setWeaponType(WeaponType.MAGICAL);
        return bossW;
    }





    public String printInfo(){
        return  "Boss health: " + this.getHealth() + " Boss damage: " + this.getDamage() + " boss weapon: "
                 + this.bossWeapon().getNameOfWeapon()
                + " weapon type: " + this.bossWeapon().getWeaponType();
    }


}
