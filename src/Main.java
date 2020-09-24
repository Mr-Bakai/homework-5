public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss boss = new Boss();
        boss.setBossDamage(60);
        boss.setBossHealth(800);
        boss.setTypeOfDefence("Magical");
        boss.printBossInfo();


        Hero hero = new Hero(300, 60, "magical");
        hero.printHeroesInfo();
        for (int i = 0; i < createHeroes().length; i++) {
            createHeroes()[i].printHeroesInfo(); // www
        }
    }

    public static Hero[] createHeroes() {
        Hero magic = new Hero(300, 50, "magical");
        Hero warrior = new Hero(280, 40);
        Hero kinetic = new Hero(290, 60, "mental");

        return new Hero[]{magic, warrior, kinetic};
    }
}
