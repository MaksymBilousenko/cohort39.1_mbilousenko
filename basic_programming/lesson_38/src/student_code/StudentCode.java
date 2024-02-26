package student_code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentCode {
    public static void main(String[] args) throws IOException {
        Collection<Integer> collection = Set.of(1, 2, 3, 4, 5, 6, 7);
        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }

        Stream<Integer> stream = getStreamFromFile();

        //IntStream intStream = getStreamFromPrimitiveValues();

        Integer oddsSum = stream.filter(e -> e % 2 == 1).reduce((c1, c2) -> c1 + c2).orElse(0);


        System.out.println("oldOdd = " + oldOdd);
        System.out.println("oddsSum = " + oddsSum);
        System.out.println("oldOdd == oddsSum = " + (oldOdd == oddsSum));

        getStreamFromArray().filter(e -> e > 3).sorted((e1, e2) -> e2 - e1).distinct().peek(e -> System.out.println(e + " ")).map(x -> x + 10).forEach(e -> System.out.println(e));
        System.out.println("getStreamFromArray().findFirst().get() = " + getStreamFromArray().findFirst().get());


    }

    static Stream<Integer> getStreamFromCollection(Collection<Integer> collection) {
        return collection.stream();
    }

    static Stream<Integer> getStreamFromValues() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7);
    }

    static IntStream getStreamFromPrimitiveValues() {
        return IntStream.of(1, 2, 3, 4, 5, 6, 7);
    }

    static Stream<Integer> getStreamFromArray() {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};

        return Arrays.stream(nums);
    }

    static Stream<Integer> getStreamFromFile() throws IOException {

        Stream<String> fromFileS = Files.lines(Paths.get("basic_programming/lesson_38/src/teacher_code/file.txt"));

        return fromFileS.map(e -> Integer.parseInt(e)).collect(Collectors.toList()).stream();
    }

}
