public class PrintStm extends Stm {
    public ExpList exps;

    public PrintStm(ExpList e) {
        exps = e;
    }

    public void eval(Runtime runtime) {
        exps.eval(runtime);
        System.out.println(runtime.value);
    }
}