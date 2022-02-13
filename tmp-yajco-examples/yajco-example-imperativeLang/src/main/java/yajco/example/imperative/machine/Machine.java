package yajco.example.imperative.machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Machine {
    private static final Machine instance = new Machine();

    private Stack<Map<String, Long>> variableStack = new Stack<Map<String, Long>>();
    private Stack<Map<String, String>> stringVariableStack = new Stack<Map<String, String>>();

    private Map<String, Long> variables;
    private Map<String, String> stringVariables;

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Machine() {
        beginFunction();
    }

    public static Machine getInstance() {
        return instance;
    }

    public void beginFunction() {
        variables = new HashMap<String, Long>();
        stringVariables = new HashMap<String, String>();
        variableStack.push(variables);
        stringVariableStack.push(stringVariables);
    }

    public void endFunction() {
        variableStack.pop();
        stringVariableStack.pop();
        variables = variableStack.peek();
        stringVariables = stringVariableStack.peek();
    }

    public long getValue(String ident) {
        return variables.get(ident);
    }

    public String getStringValue(String ident) {
        return stringVariables.get(ident);
    }

    public void setValue(String ident, long value) {
        variables.put(ident, value);
    }

    public void setValue(String ident, String value) {
        stringVariables.put(ident, value);
    }

    public void write(long value) {
        System.out.println(value);
    }

    public void write(String value) {
        System.out.println(value);
    }

    public void read(String ident) {
        try {
            String line = reader.readLine();
            setValue(ident, Long.parseLong(line));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String toString() {
        return variables.toString() +  stringVariables.toString();
    }
}
