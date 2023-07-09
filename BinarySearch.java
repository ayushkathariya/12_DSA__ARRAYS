public class BinarySearch {
  public static int binarySearch(int[] numbers, int key) {
    int start = 0, end = numbers.length - 1;

    while (start <= end) { // time complexity -> O(logn)
      int mid = (start + end) / 2;

      if (numbers[mid] == key) {
        return mid;
      }

      if (numbers[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 4, 6, 8, 10 };
    int key = 6;

    int index = binarySearch(numbers, key);

    if (index == -1) {
      System.out.println("Key is not present ");
    } else {
      System.out.println("Key is present at index " + index);
    }
  }
}
