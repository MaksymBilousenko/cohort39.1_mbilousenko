package practice.linked_list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int size = 100000; // Размер списка для тестирования

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тест добавления в конец
        comparePerformance(arrayList, linkedList, size, "Добавление в конец");

        // Тест добавления в начало
        comparePerformance(arrayList, linkedList, size, "Добавление в начало");

        // Тест удаления из начала
        comparePerformance(arrayList, linkedList, size, "Удаление из начала");


    }

    private static void comparePerformance(List<Integer> arrayList, List<Integer> linkedList, int size, String testType) {
        long startTime, endTime, arrayListDuration, linkedListDuration;

        // ArrayList
        startTime = System.nanoTime();
        performOperation(arrayList, size, testType);
        endTime = System.nanoTime();
        arrayListDuration = endTime - startTime;

        // LinkedList
        startTime = System.nanoTime();
        performOperation(linkedList, size, testType);
        endTime = System.nanoTime();
        linkedListDuration = endTime - startTime;

        System.out.println("Тест: " + testType);
        System.out.println("ArrayList:  " + arrayListDuration + " нс");
        System.out.println("LinkedList: " + linkedListDuration + " нс");
        System.out.println();
    }

    private static void performOperation(List<Integer> list, int size, String operationType) {
        switch (operationType) {
            case "Добавление в конец":
                for (int i = 0; i < size; i++) {
                    list.add(i);
                }
                break;
            case "Добавление в начало":
                for (int i = 0; i < size; i++) {
                    list.add(0, i);
                }
                break;
            case "Удаление из начала":
                for (int i = 0; i < size; i++) {
                    list.add(i);
                }
                while (!list.isEmpty()) {
                    list.remove(0);
                }
                break;
        }
    }
}

