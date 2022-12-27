package storage;

public class WeaponsInventory {

    private String weaponType;
    //If the weapon is too heavy, the user will not be able to move.
    private double weaponWeight;

    //Base attack damage of the weapon
    private double attackDamage;

    public WeaponsInventory(String weaponType, double weaponWeight, double attackDamage) {
        this.weaponType = weaponType;
        this.weaponWeight = weaponWeight;
        this.attackDamage = attackDamage;



    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public double getWeaponWeight() {
        return weaponWeight;
    }

    public void setWeaponWeight(double weaponWeight) {
        this.weaponWeight = weaponWeight;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }


}
