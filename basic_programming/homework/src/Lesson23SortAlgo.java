import java.util.Random;

public class Lesson23SortAlgo {
    public static void main(String[] args) {
        int[] array = generateRandomArray(20);

        printArray(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
        System.out.println("binarySearch(array, 30) = " + binarySearch(array, 2));
        System.out.println("lastCount(array, binarySearch(array, 2)) = " + lastCount(array, binarySearch(array, 2)));
        System.out.println("firstCount(array, 2) = " + firstCount(array, binarySearch(array, 2)));
    }

    public static int lastCount(int[] arr, int target) {
        if (target == -1) {
            return -1;
        }
        int temp = target;
        while (temp < arr.length && arr[target] == arr[temp]) {
            temp++;
        }

        return temp - 1;
    }

    private static int firstCount(int[] arr, int target) {
        if (target == -1) {
            return -1;
        }
        int temp = target;
        while (temp >= 0 && arr[target] == arr[temp]) {
            temp--;
        }
        return temp + 1;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(5);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
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

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
    }

}
