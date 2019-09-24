package edu.cnm.deepdive;

import java.util.List;
import java.util.Random;


public class Shuffler {

  private final Random random;

  /**
   * Provide the class with a random pseudo-random source, takes a standard {@link Random} object
   * @param random - random object that implements the java lang class lang.Random
   */
  public Shuffler(Random random) {
    this.random = random;
  }
  /**
   * Shuffles the elements of the array in place, given an object array.
   * @param array An array of objects.
   * @param <T> generic typing.
   */
  public <T> void shuffle(T[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int nextInt=random.nextInt(i+1);
      T temp = array[i];
      array[i]=array[nextInt];
      array[nextInt]=temp;
    }
  }

  /**
   * Shuffles a given list in place of type <T>, mirrors the {@link java.util.Collections#shuffle(List)} method.
   * @param list Generic type list to be shuffled.
   * @param <T> generic type.
   */
  public <T> void shuffle(List<T> list){
    for (int i = list.size() - 1; i >= 0; i--) {
      int nextInt=random.nextInt(i+1);
      T temp = list.get(i);
      list.set(nextInt,list.get(nextInt));
      list.set(i,temp);
    }
  }

  /**
   * Shuffles a primitive int array in place
   * @param array the int array to be shuffled
   */
  public void shuffle(int[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      int temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive double array in place
   * @param array the double array to be shuffled
   */
  public void shuffle(double[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      double temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive float array in place
   * @param array the float array to be shuffled
   */
  public void shuffle(float[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      float temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive char array in place
   * @param array the char array to be shuffled
   */
  public void shuffle(char[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      char temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive byte array in place
   * @param array the byte array to be shuffled
   */
  public void shuffle(byte[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      byte temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive long array in place
   * @param array the long array to be shuffled
   */
  public void shuffle(long[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      long temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  /**
   * Shuffles a primitive short array in place
   * @param array the short array to be shuffled
   */
  public void shuffle(short[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i + 1);
      short temp = array[i];
      array[i] = array[swap];
      array[swap] = temp;
    }
  }

}
