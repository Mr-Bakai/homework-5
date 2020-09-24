public class Hero {

    private int heroesHealth;
    private int heroesDamage;
    private String skill;


    public Hero(int heroesHealth, int heroesDamage, String skill){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.skill  = skill;

    }

    public void printHeroesInfo(){
        System.out.println("heroesHealth : " + heroesHealth + " heroesDamage: " + heroesDamage + " heroes skill: " +skill);
    }

    public Hero (int heroesHealth, int heroesDamage){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getBossHealth() {
        return heroesHealth;
    }

    public int getBossDamage() {
        return heroesDamage;
    }

    public String getSkill() {
        return skill;
    }
}
