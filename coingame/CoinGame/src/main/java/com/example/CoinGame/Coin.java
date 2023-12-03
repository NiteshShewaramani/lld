package com.example.CoinGame;

import java.util.Random;

public class Coin {
    public String getWinningFlip()
    {
        return (new Random()).nextInt(2) > 0 ?"heads":"tails";
    }
}
