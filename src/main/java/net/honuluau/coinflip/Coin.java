
package net.honuluau.coinflip;

import java.util.ArrayList;
import java.util.Random;

public class Coin {
    boolean isHeads = false;

    private static final ArrayList<Coin> COINS = new ArrayList<>();

    public static void main(String[] args) {
    }

    public boolean flipCoin() {
        Random random = new Random();
        int newInt = random.nextInt();

        if (newInt % 2 == 0) {
            isHeads = true;
        }

        COINS.add(this);

        return isHeads;
    }

    public boolean isHeads() {
        return isHeads;
    }

    public static ArrayList<Coin> getCoins() {
        return COINS;
    }
}
