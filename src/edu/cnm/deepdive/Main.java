package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random rng = new SecureRandom();
    Shuffler shuffler = new Shuffler(rng);
    int[] deck = newDeck();

    System.out.println(Arrays.toString(deck));

    shuffler.shuffle(deck);
    System.out.println();
    System.out.println(Arrays.toString(deck));


  }

  static int[] newDeck(){
    int[] deck = new int[52];
    for (int i = 0; i < 52; i++) {
      deck[i] = i;
    }
    return deck;
  }
}
