public class LinearSearch {
  public static int findIndex(int[] numbers, int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 16;

    int index = findIndex(numbers, key);

    if (index == -1) {
      System.out.println("Key is not present.");
    } else {
      System.out.println("Key is present at index " + index);
    }
  }
}
