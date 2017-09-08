import java.util.HashMap;
        import java.util.Map;

public class Runtime {
    public int value;
    public Map<String, Integer> symbolTable;

    public Runtime() {
        symbolTable = new HashMap<String, Integer>();
    }
}
