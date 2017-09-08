public class OpExp extends Exp {
    public Exp left, right;
    public int oper;
    final public static int Plus = 1, Minus = 2, Times = 3, Div = 4;

    public OpExp(Exp l, int o, Exp r) {
        left = l;
        oper = o;
        right = r;
    }

    public void eval(Runtime runtime) {
        left.eval(runtime);
        int temp = runtime.value;
        right.eval(runtime);

        switch(oper) {
            case Plus:
                runtime.value = temp + runtime.value;
                break;
            case Minus:
                runtime.value = temp - runtime.value;
                break;
            case Times:
                runtime.value = temp * runtime.value;
                break;
            case Div:
                runtime.value = temp / runtime.value;
                break;
        }
    }
}