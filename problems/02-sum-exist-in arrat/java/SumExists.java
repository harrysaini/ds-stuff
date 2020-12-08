import java.util.HashSet;

public class SumExists {

    public static boolean sumExistsInArray(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int elem: arr) {
            int diff = sum - elem;

            if(set.contains(diff)){
                return true;
            }

            set.add(elem);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 3;

        System.out.println(sumExistsInArray(arr, sum));
    }

}
