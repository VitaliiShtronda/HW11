import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {

    private static final String DELIMITER = ", ";

    public static void main(String[] args) {

        String[] strArray = {"1, 2, 0", "4, 5"};
        String sortedString = Arrays.stream(strArray)
                .flatMap(str -> str.chars().mapToObj(i -> (char) i))
                .filter(Character::isDigit)
                .sorted()
                .map(el -> "" + el)
                .collect(Collectors.joining(", "));

        System.out.println(sortedString);

    }
}
