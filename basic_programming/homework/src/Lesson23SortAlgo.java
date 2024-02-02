import java.util.Random;

public class Lesson23SortAlgo {
    public static void main(String[] args) {
        int[] array = generateRandomArray();

        printArray(array);
        quickSort(array, 0, array.length -1 );
        System.out.println("\n");
        printArray(array);
    }

//    public int firstCount (int[] arr, int target) {
//
//        return firstCount();
//    }

    private static int[] generateRandomArray () {
        Random random = new Random();
        int[] arr = new int [random.nextInt(51)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1001);
        }
        return arr;
    }

    private static int partition (int[] arr, int low, int high) {
       int pivot = arr[high];
       int index = (low - 1);

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                index++;

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[index + 1];
        arr[index + 1] = arr[high];
        arr[high] = temp;

        return index + 1;
    }

    private static void quickSort (int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static void printArray (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
    }

}
