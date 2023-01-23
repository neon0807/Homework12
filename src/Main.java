import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Predicate<Integer> checkPositiveNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0) {
                    return true;
                } else return false;
            }
        };


        Predicate<Integer> checkPositiveNumber1 = integer -> {
            if (integer > 0) {
                return true;
            } else return false;
        };


        Consumer<String> welcome = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет " + s);
            }
        };


        Consumer<String> welcome1 = s -> System.out.println("Привет " + s);


        Function<Double, Long> rounding = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return null;
            }
        };


        Function<Double, Long> rounding1 = aDouble -> null;


        Supplier<Integer> number = new Supplier<Integer>() {
            @Override
            public Integer get() {
                int a = (int) (Math.random() * 100);
                return a;
            }
        };


        Supplier<Integer> number1 = () -> {
            int a = (int) (Math.random() * 100);
            return a;
        };




        public static <T, U> Function<T, U> ternaryOperator();{


            Predicate<? super T> condition = (Predicate<T>) t -> false;

            Function<? super T, ? extends U> ifTrue = (Function<T, U>) t -> null;

            Function<? super T, ? extends U> ifFalse = (Function<T, U>) t -> null;


            if (condition.test(T t)){
                return ifTrue(T, U);
            } else return ifFalse(T, U);


        }

    }

    private static Object ternaryOperator() {
        return null;
    }
}
