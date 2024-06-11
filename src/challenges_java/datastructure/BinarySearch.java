package challenges_java.datastructure;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 96, 100};

        System.out.println(SearchNumber(array, 100));
    }

    public static int SearchNumber(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            int tip = array[mid];

            if (tip == target) {
                return mid;
            }
            if (tip > target) {
                max = mid -1;
            } else {
                min = mid + 1;
            }
        }

        return -1;
    }
}
