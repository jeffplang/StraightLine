public class LastExpList extends ExpList {
    public LastExpList(Exp h) {
        head = h;
    }
    public void eval(Runtime runtime) {
        head.eval(runtime);
    }
}