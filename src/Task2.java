import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Iva", "Avan", "Valerii", "Gor", "Vova", "Dmytro");
        System.out.println(getSortedListOfUpperCaseStrings(names));

    }
    private static List<String> getSortedListOfUpperCaseStrings(List<String> names) {
        Stream<String> stringStream = names.stream();

        return stringStream
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }
}
