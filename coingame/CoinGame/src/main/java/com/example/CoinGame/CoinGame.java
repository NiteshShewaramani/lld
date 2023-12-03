package com.example.CoinGame;

import java.util.Random;

public class CoinGame {
    private Player[] players= new Player[2];
    private Coin coin = new Coin();
    public CoinGame(String player1,String player2)
    {
        players[0] = new Player(player1);
        players[1] = new Player(player2);
    }
    public void startGame()
    {
        //first get a random player to pick coin
        int winningIndex = (new Random()).nextInt(2) > 0 ?0:1;
        String choiceOfSelectedPlayer =  players[winningIndex].getRandomCoinOption();
        if(choiceOfSelectedPlayer.equals("heads"))
            players[1-winningIndex].setCoinOption("tails");
        else
            players[1-winningIndex].setCoinOption("heads");

        String winningFlip = coin.getWinningFlip();
        players[0].getPredection(winningFlip);
        players[1].getPredection(winningFlip);
    }

}
