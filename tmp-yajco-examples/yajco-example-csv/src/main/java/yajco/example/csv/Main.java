package yajco.example.csv;

import yajco.example.csv.model.Values;
import yajco.example.csv.parser.CsvParser;

public class Main {
    public static void main(String[] args) throws Exception {
        String expr = "1,2,3";

        Values values ;
        values = new CsvParser().parse(expr);
        System.out.println("--------------------- PROGRAM RESULT ---------------------");
        System.out.println(values);
    }
}
