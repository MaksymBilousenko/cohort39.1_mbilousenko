package consultation2024_02_15.students_sandbox;

public class StudentSandBox1 {
    public static void main(String[] args) {
        add("123456", "789");
    }

    public static String add(String str1, String str2) {
        int sumOfLast = 0;
        String[] array1 = str1.split("");
        String[] array2 = str2.split("");
        int max = array1.length > array2.length ? array1.length : array2.length;

        for (int i = 0; i <= max - 1; i++) {
            int index = array1.length - i - 1;
            if (index < array1.length && index >= 0) {

            }
            int index1 = array2.length - i - 1;
            if (index < array2.length && index1 >= 0) {

            }

        }


        return null;
    }


}
