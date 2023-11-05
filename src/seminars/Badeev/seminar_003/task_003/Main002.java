package seminars.Badeev.seminar_003.task_003;

import java.util.Arrays;
import java.util.List;

public class Main002 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        numbers.sort((num1, num2) -> num1 - num2);
        System.out.println(numbers); // вывод [1, 2, 3, 5, 8]
    }
}
