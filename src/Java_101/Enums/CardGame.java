package Java_101.Enums;

import java.util.Random;

public class CardGame {

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEV, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public static void main(String[] args) {
        final Random rand = new Random();

        final int randomRankChoice = rand.nextInt(Rank.values().length);
        final Rank randomRank = Rank.values()[randomRankChoice];

        final int randomSuitChoice = rand.nextInt(Suit.values().length);
        final Suit randomSuit = Suit.values()[randomSuitChoice];

        System.out.println("You selected: " + randomRank + " of " + randomSuit);
    }
}
