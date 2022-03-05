package yajco.example.csv;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import yajco.example.csv.model.Values;
import yajco.example.csv.parser.CsvParser;

public class IntegrationTest {

    @Test
    public void simpleTest() throws Exception {
        String input = "1,2,3";
        Values values = new Values(new int[] {1,2,3});
        Assert.assertEquals(values, getParsedValues(input));
    }

    @Test
    public void duplicateTest() throws Exception {
        String input = "1,2,2,3";
        ThrowingRunnable getParsedJsonObjectRunnable = () -> getParsedValues(input);
        Exception e = Assert.assertThrows(RuntimeException.class, getParsedJsonObjectRunnable);

        String expectedMessage = "Parse error. Found not unique object: 2";
        String actualMessage = e.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    private Values getParsedValues(String input) throws Exception {
        Values values = new CsvParser().parse(input);
        return values;
    }
}
