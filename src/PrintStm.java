public class PrintStm extends Stm {
    public ExpList exps;

    public PrintStm(ExpList e) {
        exps = e;
    }

    public void eval(Runtime runtime) {
        exps.head.eval(runtime);

        if (exps instanceof LastExpList) {
            System.out.println(runtime.value);
        } else {
            System.out.print(runtime.value + " ");
            (new PrintStm(exps.tail)).eval(runtime);
        }
    }
}