package teacher_code;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class TeacherCode2 {
    public static void main(String[] args) {
        Collection<Integer> collection = Set.of(1, 2, 3, 4, 5, 6, 7);
        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }

        Stream<Integer> stream = getStreamFromCollection(collection);

        Integer oddsSum = stream
                .filter(e -> e % 2 == 1)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);


        System.out.println("oldOdd = " + oldOdd);
        System.out.println("oddsSum = " + oddsSum);


    }

    static Stream<Integer> getStreamFromCollection(Collection<Integer> collection) {
        return collection.stream();
    }


}
