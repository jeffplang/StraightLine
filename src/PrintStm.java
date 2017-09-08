public class PrintStm extends Stm {
    public ExpList exps;

    public PrintStm(ExpList e) {
        exps = e;
    }

    public void eval(Runtime runtime) {
        exps.head.eval(runtime);
        System.out.print(runtime.value);

        if (exps.tail != null) {
            System.out.print(" ");
            PrintStm frame = new PrintStm(exps.tail);
            frame.eval(runtime);
        } else {
            System.out.println("");
        }
    }
}