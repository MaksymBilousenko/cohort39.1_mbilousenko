import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson34Stack {
    public static void main(String[] args) {
        String line = readFromFile("basic_programming/homework/src/bracket.txt");
        if (line != null) {
            boolean result = isValid(line);
            writeToFile("output.txt", String.valueOf(result));
        } else {
            System.out.println("Файл пустой");
        }
    }
    // Метод для чтения данных из файла и возвращения содержимого в виде строки
    public static String readFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return stringBuilder.toString();
    }

    // Метод для записи результата в файл
    public static void writeToFile(String fileName, String result) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // метод проверяет скобочную последовательность, если последовательность верна возвращаем true, если нет false
    public static boolean isValid(String string) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            // используется для преобразования символа, находящегося в строке string по индексу i, в строку (можно сказать,
            // мы делим строку по символьно)
            String bracket = Character.toString(string.charAt(i));
            // если в строке появляется открывающая скобка, то мы добавляем ее в Stack
            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{") || bracket.equals("<")) {
                stack.push(bracket);
                // если в строке появляется закрывающая скобка, то с помощью switch case проверяем на пару, если она
                // совпадает, то удаляем верхушку стека. В противном случаее возвращаем false
            } else if (bracket.equals(")") || bracket.equals("]") || bracket.equals("}") || bracket.equals(">")) {
                if (stack.isEmpty()) {
                    return false;
                }
                switch (bracket) {
                    case ")":
                        if (stack.pop().equals("(")) {
                        } else {
                            return false;
                        }
                        break;
                    case "]":
                        if (stack.pop().equals("[")) {
                        } else {
                            return false;
                        }
                        break;
                    case "}":
                        if (stack.pop().equals("{")) {
                        } else {
                            return false;
                        }
                        break;
                    case ">":
                        if (stack.pop().equals("<")) {
                        } else {
                            return false;
                        }
                        break;
                }


            }
        }
        return stack.isEmpty();
    }
}

class BrecketValidTest {
    @Test
    public void testValid() {
        assertTrue(Lesson34Stack.isValid("()"));
        assertTrue(Lesson34Stack.isValid("[]"));
        assertTrue(Lesson34Stack.isValid("{}"));
        assertTrue(Lesson34Stack.isValid("<>"));
        assertTrue(Lesson34Stack.isValid("{(<{}[]>)}"));
    }

    @Test
    public void testInvalid() {
        assertFalse(Lesson34Stack.isValid("("));
        assertFalse(Lesson34Stack.isValid(")"));
        assertFalse(Lesson34Stack.isValid("["));
        assertFalse(Lesson34Stack.isValid("]"));
        assertFalse(Lesson34Stack.isValid("{"));
        assertFalse(Lesson34Stack.isValid("}"));
        assertFalse(Lesson34Stack.isValid("<"));
        assertFalse(Lesson34Stack.isValid(">"));
        assertFalse(Lesson34Stack.isValid("(([))"));
        assertFalse(Lesson34Stack.isValid(")("));
        assertFalse(Lesson34Stack.isValid("{}[]())"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Lesson34Stack.isValid(""));

    }
}

