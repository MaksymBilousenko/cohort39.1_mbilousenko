
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson34Stack {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("bracket.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            }

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
            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{") || bracket.equals("<")) {
                stack.push(bracket);
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

