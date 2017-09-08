public class NumExp extends Exp {
    public int num;

    public NumExp(int n) {
        num = n;
    }

    public void eval(Runtime runtime){
        runtime.value = num;
    }
}