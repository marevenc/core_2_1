import java.util.function.*;

public class Calculator<T extends Number> {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Double> divide = (x, y) -> {
                                            if(y != 0)
                                                return x/y;
                                            else {System.out.println("Деление на ноль!");
                                            return Double.MAX_VALUE;}
                                            };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<T> println = System.out::println;
}
