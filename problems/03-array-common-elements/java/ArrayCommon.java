import java.util.HashSet;

public class ArrayCommon {

    public static boolean arrayContainsSame(int[] arr1, int[] arr2) {
        HashSet<Integer> map = new HashSet<>();

        for (int elem: arr1){
            map.add(elem);
        }

        for(int elem: arr2) {
            if(map.contains(elem)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {12,1};

        System.out.println(arrayContainsSame(arr1, arr2));
    }
}
