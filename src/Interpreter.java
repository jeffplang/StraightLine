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
//        run(prog2);

        // print(1); print(2); print(3);
        Stm prog3 = new CompoundStm(
                new PrintStm(new LastExpList(new NumExp(1))),
                new CompoundStm(
                        new PrintStm(new LastExpList(new NumExp(2))),
                        new PrintStm(new LastExpList(new NumExp(3)))
                )
        );

//        run(prog3);

        // a := 3; print(a);
        Stm prog4 = new CompoundStm(
                new AssignStm("a", new NumExp(3)),
                new PrintStm(new LastExpList(new IdExp("a")))
        );

        run(prog4);
    }
}
