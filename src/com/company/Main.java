package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Wizards vs Warlocks");
        System.out.println("Let the Battle Begin\n");

        Wizard Lugia = new Wizard("Lugia", 0, 300, 300);
        Warlock Darkrai = new Warlock("Darkrai", 0, 300, 300);

        Lugia.dispCharName();
        Darkrai.dispCharName();

        System.out.println("\nLugia will do the first attack.");
        Lugia.judgment(Darkrai);
        Darkrai.displayStatus();
        System.out.println("\nDarkai's turn.");
        Darkrai.darkVoid(Lugia);
        Lugia.displayStatus();
        System.out.println("\nLugia's turn.");
        Lugia.lunarPurge(Darkrai);
        Darkrai.displayStatus();
        System.out.println("\nDarkai's turn.");
        Darkrai.doomDesire(Lugia);
        Lugia.displayStatus();
        System.out.println("\nLugia's turn.");
        Lugia.jungleHealing();
        Lugia.displayStatus();
        System.out.println("\nDarkai's turn.");
        Darkrai.oblivionWing();
        Darkrai.displayStatus();
        System.out.println("\nLugia's turn.");
        Lugia.lunarPurge(Darkrai);
        Darkrai.displayStatus();

        Lugia.win();

        System.out.println("\nShowing final status");
        Lugia.finalStat();
        Darkrai.finalStat();
    }
}
