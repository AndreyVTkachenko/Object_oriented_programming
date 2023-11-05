package seminars.Badeev.seminar_003.task_003;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main001 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // используем компаратор для сортировки в порядке возрастания
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2);
            }
        });
        System.out.println(numbers); // вывод [1, 2, 3, 5, 8]
    }
}
