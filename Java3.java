import java.util.ArrayList;
import java.util.List;

public class Java3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Удаление четных чисел
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println(numbers); // Вывод: [1, 3, 5]
    }
}
