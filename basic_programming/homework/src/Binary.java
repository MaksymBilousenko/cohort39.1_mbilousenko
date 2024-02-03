public class Binary {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int steps = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // проверка, что середина является элементом, который ищем
            if (arr[mid] == target) {
                //System.out.printf("Элемент найден. На поиск элемента затрачено %d шагов\n", steps);
                return mid;
            }

            // если середина меньше искомого элемента, то поиск будет смещен в правую половину
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // если середина больше искомого элемента, то поиск будет смещен в левую половину
            else {
                right = mid - 1;
            }
            steps++;
        }

        //System.out.printf("Элемент не был найден. На поиск элемента затрачено %d шагов\n", steps);

        // If element is not present in array
        return -1;
    }
}
