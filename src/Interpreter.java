public class Interpreter {
    private static void run(Stm s) {
        Runtime runtime = new Runtime();

        s.eval(runtime);
    }
    public static void main(String[] args) {
        // a := 5+3; b := (print(a, a-1), 10*a); print(b)

        // print(5)
        Stm prog = new PrintStm(new LastExpList(new NumExp(6)));

        run(prog);
    }
}
