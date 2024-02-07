package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExercises {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("queue = " + queue);
        reverseQueue(queue);
    }

    /**
     * Задача 1: Реверс элементов в очереди.<p>
     * Описание: Дана очередь. Необходимо реверсировать ее элементы без использования дополнительных структур данных, кроме стека.
     * @param queue Очередь, элементы которой нужно реверсировать.
     */
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        // 1, 2, 3
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println("queue = " + queue);
    }

    /**
     * Задача 2: Сортировка стека.<p>
     * Описание: Дан стек целых чисел. Необходимо отсортировать стек в порядке возрастания, используя только дополнительный стек.
     * @param input Входной стек для сортировки.
     * @return Отсортированный стек.
     */
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        return tempStack;
    }


    /**
     * Задача 3: Валидация скобок с вложенными повторениями. <p>
     * Описание: Дана строка, содержащая символы '(', ')', а также числа, указывающие количество повторений для вложенных скобок. <p>
     *           Например, строка "3(2(1))" эквивалентна "((1)(1)(1))". Проверьте, является ли последовательность скобок валидной.
     * @param str Строка для проверки.
     * @return Возвращает true, если последовательность валидна, иначе false.
     */
    public static boolean validateNestedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || Character.isDigit(ch)) {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() == '(') {
                    stack.pop(); // Удаляем соответствующую открывающую скобку
                } else {
                    return false; // Некорректная последовательность
                }
            }
        }

        return stack.isEmpty(); // Если стек пуст, последовательность валидна
    }
}

