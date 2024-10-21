/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// Coding Project a Day #2
package net.honuluau.coinflip;

import java.util.Scanner;

/**
 *
 * @author dd18787
 */
public class Coinflip {
    public static int coinsToFlip = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many coins do you want to flip?");

        String numberString = scanner.nextLine();
        coinsToFlip = Integer.parseInt(numberString);

        int coinsThatAreHeads = 0;
        for (int i = 0; i < coinsToFlip; i++) {
            Coin currentCoin = new Coin();
            boolean coinIsHeads = currentCoin.flipCoin();

            if (coinIsHeads == true) {
                coinsThatAreHeads++;
            }
        }

        double percentOfHeads = ( (double) coinsThatAreHeads/coinsToFlip)*100;

        String outputLine = "There were " + coinsThatAreHeads + " coins that landed on heads. Which was " + percentOfHeads + "% of coins.";
        System.out.println(outputLine);
    }
}
