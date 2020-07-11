public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = (int) calc.plus.apply(1, 2);
        int b = (int) calc.minus.apply(1,1);
        double c = (double) calc.divide.apply((double) a, (double) b);

        calc.println.accept(c);
        /*
        Если не делать приведение типов, то деление без округления
        у меня по-другому не получается сделать
         */
    }
}
