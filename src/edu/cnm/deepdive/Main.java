package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {

  /**
   * Entry point, used for testing cases.
   * @param args standard main input args.
   */
  public static void main(String[] args) {
    Random rng = new SecureRandom();
    Shuffler shuffler = new Shuffler(rng);
    int[] deck = newDeck();

    System.out.println(Arrays.toString(deck));


    String[] data = (new String[]{"The quick brown fox jumped of the lazy dog"})[0].split(" ");
    Object[] dataTwo = { 1, new String("World"), 10L };
    System.out.println(((Integer) dataTwo[0]).doubleValue());

    shuffler.shuffle(deck);
    System.out.println();
    System.out.println(Arrays.toString(deck));
  }


  /**
   * Testing class, returns a "deck" of sorted cards to test the shuffle on
   * @return sorted int Array
   */
  static int[] newDeck(){
    int[] deck = new int[52];
    for (int i = 0; i < 52; i++) {
      deck[i] = i;
    }
    return deck;
  }
}
