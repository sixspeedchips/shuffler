package edu.cnm.deepdive;

import java.util.Random;


public class Shuffler<E> {

  private final Random random;

  public Shuffler(Random random) {
    this.random = random;
  }

  void shuffle(E[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int nextInt=random.nextInt(i+1);
      E temp = array[i];
      array[i]=array[nextInt];
      array[nextInt]=temp;
    }
  }

  void shuffle(int[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      int temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(double[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      double temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(float[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      float temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(char[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      char temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(byte[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      byte temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(long[] array){
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i+1);
      long temp = array[i];
      array[i]=array[swap];
      array[swap]=temp;
    }

  }

  void shuffle(short[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      int swap = random.nextInt(i + 1);
      short temp = array[i];
      array[i] = array[swap];
      array[swap] = temp;
    }
  }

}
