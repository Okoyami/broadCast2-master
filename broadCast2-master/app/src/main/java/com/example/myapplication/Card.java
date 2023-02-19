package com.example.myapplication;
public class Card {
    private Suit suit;
    private int rank;
    private int image;

    private String color;

    public Card(Suit suit, Rank rank, int image) {
        this.suit = suit;
        this.rank = rank;
        this.image = image;
    }

    // Getter methods for the suit, rank, and image
    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getImage() {
        return image;
    }

    public String getColor() {
        return color;
    } public  void setSuit(Suit suit){this.suit=suit; if(suit == "Diamonds"|| suit == "Hearts")color="red" else color= "black"; }
    public  void setRank (int rank){this.rank=rank;}
    public  void setImage (int image){this.image=image;}
}
