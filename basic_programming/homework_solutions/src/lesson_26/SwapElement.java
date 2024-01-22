package lesson_26;

public class SwapElement<E> {

    public void swap(E[] array) {
        E temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}
