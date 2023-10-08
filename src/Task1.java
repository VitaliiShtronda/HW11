import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Iva", "Ivan", "Ivor", "Igor", "Vova", "Dmytro");

        String result = getNamesAtOddIndices(names);
        System.out.println(result);
    }

    public static String getNamesAtOddIndices(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(names::get)
                .collect(Collectors.joining(", "));
    }
}

