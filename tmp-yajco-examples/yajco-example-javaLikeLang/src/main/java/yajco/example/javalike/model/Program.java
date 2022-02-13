package yajco.example.javalike.model;

//import yajco.example.javalike.model.function.Function;
//import yajco.example.javalike.model.statement.Block;

import yajco.example.javalike.model.function.Function;
import yajco.example.javalike.model.statement.Block;

public class Program {
    private final Function[] functions;

    private final Block main;

    public Program(Function[] functions, Block main) {
        this.functions = functions;
        this.main = main;
    }

    public void execute() {
        getMain().execute();
    }

    /**
     * @return the functions
     */
    public Function[] getFunctions() {
        return functions;
    }

    /**
     * @return the main
     */
    public Block getMain() {
        return main;
    }
}
