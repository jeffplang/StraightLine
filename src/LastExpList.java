public class LastExpList extends ExpList {
    public Exp head;

    public LastExpList(Exp h) {
        head = h;
    }
    public void eval(Runtime runtime) {
        this.head.eval(runtime);
    }
}