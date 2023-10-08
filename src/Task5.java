import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {

        List<String> first = Arrays.asList("Iva", "Ivan", "Ivor", "Igor", "Vova", "Dmytro");
        List<String> second = Arrays.asList("1", "2", "3","4", "5");

        zip(first.stream(), second.stream())
                .peek(System.out::println)
                .collect(Collectors.toList());



    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream<T> result = Stream.empty();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterator.next()));
            result = Stream.concat(result, Stream.of(secondIterator.next()));

        }
        return result;
    }


}
