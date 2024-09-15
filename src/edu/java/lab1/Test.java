package edu.java.lab1;

/**
 * 
 * @author Rasul Dzhavadov 3313
 * @version 1.00
 *
 */
public class Test {

  /**
   * Точка входа программы. Инициализирует массив и сортирует его по возрастанию и убыванию.
   *
   * @param args - вводимая строка (не используется)
   */
  public static void main(String args[]) {

    // Инициализация массива целых чисел
    int[] arr = {1, 0, 13, 7, 9, 4, 34};

    // Выводим исходный массив
    System.out.println("Исходный массив:");
    printArray(arr);

    // Сортируем массив по возрастанию
    sortAscending(arr);
    System.out.println("\nМассив по возрастанию:");
    printArray(arr);

    // Сортируем массив по убыванию
    sortDescending(arr);
    System.out.println("\nМассив по убыванию:");
    printArray(arr);
  }

  /**
   * Сортирует массив целых чисел по возрастанию.
   *
   * @param arr - массив целых чисел для сортировки
   */
  public static void sortAscending(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  }

  /**
   * Сортирует массив целых чисел по убыванию.
   *
   * @param arr - массив целых чисел для сортировки
   */
  public static void sortDescending(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  }

  /**
   * Выводит массив на экран.
   *
   * @param arr - массив целых чисел для вывода
   */
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Number[" + i + "]=" + arr[i]);
    }
  }
}
