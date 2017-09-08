public class Interpreter {
    private static void run(Stm s) {
        Runtime runtime = new Runtime();

        s.eval(runtime);
    }
    public static void main(String[] args) {
        // a := 5+3; b := (print(a, a-1), 10*a); print(b)

        // print(5)
        Stm prog = new PrintStm(new LastExpList(new NumExp(6)));

        // print(5 + 3)
//        run(prog);

        Stm prog2 = new PrintStm(
                        new LastExpList(
                            new OpExp(new NumExp(4), OpExp.Times, new NumExp(5))
                        )
                    );
        run(prog2);
    }
}
