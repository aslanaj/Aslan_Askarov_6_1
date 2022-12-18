public class Weapon {
    private WeaponType weaponType;
    private String nameOfWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType guns) {
        this.weaponType = weaponType;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }



    public String infoWeapon(){
        return " Name of weapon: " + this.getNameOfWeapon() + " Weapon type: "
                + this.getWeaponType();
}


}
