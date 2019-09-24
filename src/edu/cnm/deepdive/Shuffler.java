package edu.cnm.deepdive;

import java.util.Random;


public class Shuffler {

  private final Random random;

  public Shuffler(Random random) {
    this.random = random;
  }

  public <T> void shuffle(T[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int nextInt=random.nextInt(i+1);
      T temp = array[i];
      array[i]=array[nextInt];
      array[nextInt]=temp;
    }
  }

  public void shuffle(int[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      int temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(double[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      double temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(float[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      float temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(char[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      char temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(byte[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      byte temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(long[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      long temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  public void shuffle(short[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i + 1);
      short temp = array[i];
      array[i] = array[swap];
      array[swap] = temp;
    }
  }

}
