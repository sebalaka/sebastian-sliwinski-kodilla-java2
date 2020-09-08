public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int dodawanie()
    {
        return a + b;
    }

    public int odejmowanie()
    {
        return a - b;
    }

    public static void main(String[] args) {



        Calculator calculator = new Calculator(2,4);
        System.out.println(calculator.dodawanie());
        System.out.println(calculator.odejmowanie());
    }
}
