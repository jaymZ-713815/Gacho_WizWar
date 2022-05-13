package com.company;

public class Character {

    public String characterName;
    public int level;
    public int healthPoint;
    public int manaPoint;

    Character(String name, int level, int hp, int mp){
        this.characterName = name;
        this.level =level;
        this.healthPoint = hp;
        this.manaPoint = mp;
    }

    public void displayStatus(){
        System.out.println("\nCharacter Name: " + this.characterName);
        System.out.println("Level: " + this.level);
        System.out.println("Health Points: " + this.healthPoint);
        System.out.println("Mana Points: " + this.manaPoint);
        System.out.print("--------------------------------------------");
    }

    public void dispCharName(){
        System.out.println("Character Initialized: " + this.characterName);
    }

    public void recovery(int manaInc, int healthInc){
        this.manaPoint += manaInc;
        this.healthPoint += healthInc;
    }

    public void manaCost(int manaPoint){
        this.manaPoint -= manaPoint;
    }

    public void damageTarget(Character enemyCharacter, int damagePoint){
        enemyCharacter.healthPoint -= damagePoint;
        System.out.println("Character HP dropped to: " + enemyCharacter.healthPoint);
    }

    public void win() {
        System.out.println("\nOpponent Character has been defeated!!");
        System.out.println("Battle is ENDED.\n");
        System.out.println(this.characterName + " leveled up!");
        this.level += 10;
    }

    public void finalStat(){
        System.out.println("\nCharacter Name: " + this.characterName);
        System.out.println("Level: " + this.level);
        System.out.println("Health Points: " + this.healthPoint);
        System.out.println("Mana Points: " + this.manaPoint);
    }
}