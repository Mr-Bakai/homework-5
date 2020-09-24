public class Boss {

    private int bossHealth;
    private int bossDamage;
    private String typeOfDefence;

    public Boss(int bossHealth, int bossDamage, String typeOfDefence) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.typeOfDefence = typeOfDefence;
    }

    public Boss() {
    }

    public void printBossInfo() {
        System.out.println("Boss damage: "+getBossDamage() + " Boss health: " + getBossHealth() + " Boss type: " + getTypeOfDefence());

    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}
