package Algo;

public class BinarySearch {
  public static void main(String[] args) {

    int[] a = {1, 3, 5, 6, 8, 19};
    int targetSearch = 0;
    int findAtPosition = binarySearch(a, targetSearch);
    if (findAtPosition != -1) System.out.println("TargetSearch found at position :" + findAtPosition);
    else System.out.println("TargetSearch Not found");
  }

  public static Integer binarySearch(int[] a, int targetSearch) {
    int low = 0;
    int high = a.length - 1;
    int mid = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      if (a[mid] == targetSearch) {
        System.out.println("Item Found at index " + (mid + 1));
        return mid + 1;
      } else if (a[mid] < targetSearch) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
