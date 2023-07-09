public class LargestAndSmallest {
  public static int findLargest(int[] numbers) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
    }

    return largest;
  }

  public static int findSmallest(int[] numbers) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (smallest > numbers[i]) {
        smallest = numbers[i];
      }
    }

    return smallest;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 4, 6, 12, 14, 16, 1, 15, 13 };

    int largestNumber = findLargest(numbers);
    int smallestNumber = findSmallest(numbers);

    System.out.println("The largest number is " + largestNumber);
    System.out.println("The smallest number is " + smallestNumber);
  }
}
