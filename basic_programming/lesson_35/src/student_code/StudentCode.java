package student_code;

import java.time.LocalDateTime;

public class StudentCode {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime firstDayOfYear = ldt.withDayOfYear(1);
        LocalDateTime ldt2 = firstDayOfYear.plusHours(1000);
        System.out.println("ldt2.getDayOfWeek() = " + ldt2.getDayOfWeek());

    }
}
