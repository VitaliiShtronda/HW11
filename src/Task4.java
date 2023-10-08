import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Task4 {
    public static void main(String[] args) throws InterruptedException {



        RandomAlg myRandom = new RandomAlg(25214903917L, 11, 2 ^ 48);

                Stream<Long> myStream = getStreamOfRandomLong(myRandom);

                myStream
                .peek(System.out::println)
                .collect(Collectors.toList());
    }


    public static Stream<Long> getStreamOfRandomLong(RandomAlg random) {
        return Stream.iterate(random.getC(), seed -> random.next());
    }

}



class RandomAlg {



    private long a;
    private long c;
    private long m;

    private long x;


    public long getC() {
        return c;
    }



    public RandomAlg(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;

        this.x = c;
    }



    public long next() {
        return (a * x++ + c) % m;
    }
}
