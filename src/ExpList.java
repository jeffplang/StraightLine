public abstract class ExpList {
    public Exp head;
    public ExpList tail;
    public abstract void eval(Runtime runtime);
}