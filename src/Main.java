import java.util.ArrayList;
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



        Function<Double, Long> rounding = new Function<>(){
            @Override
            public Long apply(Double aDouble) {
                bLong = aDouble;
                return bLong;
            }
        };


        Function<Double, Long> rounding1 = aDouble -> bLong;


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




        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> noEvenNum = new ArrayList<>();

        Predicate<Integer> condition = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        };

        Function<Integer, ArrayList> ifTrue = new Function<>() {
            @Override
            public ArrayList apply(Integer integer) {
                evenNum.add(integer);
                return evenNum;

            }
        };


        Function<Integer, ArrayList> ifFalse = new Function<>() {
            @Override
            public ArrayList apply(Integer integer) {
                noEvenNum.add(integer);
                return noEvenNum;
            }

        };



    }

}




