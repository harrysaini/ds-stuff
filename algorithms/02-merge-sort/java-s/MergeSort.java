import java.util.Arrays;

public class MergeSort {

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int i = 0,j = 0, k = 0;

        while ( i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length ) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length ) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        return combineArrays(leftArr, rightArr);
    }

    public static void main(String[] args) {
        int[] arr = {1,23,4,32,43,43,43,43,43,2,32,32,1,3};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
