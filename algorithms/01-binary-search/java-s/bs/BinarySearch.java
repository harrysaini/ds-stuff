

public class BinarySearch {

    public static int binarySearch(int[] arr, int elem, int start, int end) {
        if(start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == elem) {
            return mid;
        } if (arr[mid] > elem) {
            return binarySearch(arr, elem, 0, mid);
        } else {
            return binarySearch(arr, elem, mid + 1, end);
        }

    }

    public static int findindex(int[] arr , int elem) {
        return binarySearch(arr, elem, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,6};

        System.out.println(findindex(arr, 4));
    }
}
