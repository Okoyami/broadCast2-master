package com.example.myapplication;
import android.media.Image;
import android.provider.MediaStore;
import android.widget.ImageView;

import java.util.ArrayList;;
import java.util.Collections;
import java.util.Stack;


    class ShuffledDeck {

    private Stack <Card> deck;

    public ShuffledDeck() {
        Card a;
        int i =0;
        deck = new Stack<Card>();
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int [] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int [] images = {R.drawable.a_ace_of_spades,R.drawable.a_2_of_spades,R.drawable.a_3_of_spades,R.drawable.a_4_of_spades,R.drawable.a_5_of_spades,R.drawable.a_6_of_spades,R.drawable.a_7_of_spades,R.drawable.a_8_of_spades,R.drawable.a_10_of_clubs,R.drawable.a_10_of_diamonds,R.drawable.a_10_of_hearts,R.drawable.a_10_of_spades,R.drawable.a_2_of_clubs,R.drawable.a_2_of_diamonds,R.drawable.a_2_of_hearts,R.drawable.a_3_of_clubs,R.drawable.a_3_of_diamonds,R.drawable.a_3_of_hearts,R.drawable.a_4_of_clubs,R.drawable.a_4_of_diamonds,R.drawable.a_4_of_hearts,R.drawable.a_5_of_clubs,R.drawable.a_5_of_diamonds,R.drawable.a_5_of_hearts,R.drawable.a_6_of_clubs,R.drawable.a_6_of_diamonds,R.drawable.a_6_of_hearts,R.drawable.a_7_of_clubs,R.drawable.a_7_of_diamonds,R.drawable.a_7_of_hearts,R.drawable.a_8_of_clubs,R.drawable.a_8_of_diamonds,R.drawable.a_8_of_hearts,R.drawable.a_9_of_clubs,R.drawable.a_9_of_diamonds,R.drawable.a_9_of_hearts,R.drawable.a_9_of_spades,R.drawable.a_ace_of_clubs,R.drawable.a_ace_of_diamonds,R.drawable.a_ace_of_hearts,R.drawable.a_jack_of_clubs,R.drawable.a_jack_of_diamonds,R.drawable.a_jack_of_hearts,R.drawable.a_jack_of_spades,R.drawable.a_king_of_clubs,R.drawable.a_king_of_diamonds,R.drawable.a_king_of_hearts,R.drawable.a_king_of_spades,R.drawable.a_queen_of_clubs,R.drawable.a_queen_of_diamonds,R.drawable.a_queen_of_hearts,R.drawable.a_queen_of_spades};
        for (String suit : suits) {
            for (int rank : ranks) {a.getSuit(suit); a.getRank(rank)
                deck.push(a);

            }
        }


        // shuffle the deck
        ArrayList<String> shuffledDeck = new ArrayList<>(deck);
        Collections.shuffle(shuffledDeck);
        deck.clear();
        deck.addAll(shuffledDeck);
    }

    public void printDeck() {
        System.out.println("Deck of Cards:");
        for (String card : deck) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        ShuffledDeck shuffledDeck = new ShuffledDeck();
        shuffledDeck.printDeck();
    }
}



