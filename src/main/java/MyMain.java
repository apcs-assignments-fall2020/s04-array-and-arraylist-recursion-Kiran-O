import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return (isSortedRec(list, 0));
        
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        int ynk = i + 1;
        if (list.size() <= ynk){
            return true;
        }
        else if (list.get(i) > list.get(ynk)){
            return false;
        }
        else {
            return (isSortedRec(list, ynk));
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return (hasCountCopiesRec(arr, x, count, 0));
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (arr.length <= i && count == 0){
            return true;
        }
        else if (arr.length <= i){
            return false;
        }
        else if (arr[i] == x){
            count--;
        }
        return (hasCountCopiesRec(arr, x, count, i + 1));
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return (binarySearchRec(arr, num, 0, arr.length - 1));
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        int jkl = upperBound + lowerBound;
        int mid = jkl/2;
        if (lowerBound == upperBound - 1){
            return false;
        }
        else if (arr[mid] == num){
            return true;
        }
        else if (arr[mid] > num){
            upperBound = mid;
        }
        else {
            lowerBound = mid;
        }
        return (binarySearchRec(arr, num, lowerBound, upperBound));
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
