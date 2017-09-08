public class AssignStm extends Stm {
    public String id; public Exp exp;

    public AssignStm(String i, Exp e) {
        id = i;
        exp = e;
    }

    public void eval(Runtime runtime) {
        exp.eval(runtime);
        runtime.symbolTable.put(id, runtime.value);
    }
}
