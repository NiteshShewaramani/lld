package com.example.CoinGame;

import java.util.Random;

public class Player {
    private  String name="";
    private String choice="";

    public Player(String newName)
    {
        name = newName;
    }

    public void setCoinOption(String coinOption)
    {
        choice = coinOption;
    }

    public String getRandomCoinOption()
    {
        choice = (new Random()).nextInt(2) > 0 ?"heads":"tails";
        return choice;
    }
    public void getPredection(String winningFlip)
    {
        if(winningFlip.equals(choice))
            System.out.println(name + " won with choice " + choice);
        else
            System.out.println(name + " lost with choice " + choice);

    }

}
