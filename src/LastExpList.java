public class LastExpList extends ExpList {
    public LastExpList(Exp h) {
        head = h;
        tail = null;
    }
    public void eval(Runtime runtime) {
        this.head.eval(runtime);
    }
}