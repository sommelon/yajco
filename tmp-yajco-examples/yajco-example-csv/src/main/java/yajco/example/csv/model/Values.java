package yajco.example.csv.model;

import yajco.annotation.Separator;
import yajco.annotation.Token;
import yajco.annotation.UniqueValues;

import java.util.Arrays;

public class Values{
    private final int[] ints;

    public Values(@UniqueValues @Separator(",") @Token("VALUE") int[] ints) {
        this.ints = ints;
    }

    public int[] getInts() {
        return ints;
    }

    @Override
    public String toString() {
        return Arrays.toString(ints);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Values values = (Values) o;

        return Arrays.equals(ints, values.ints);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ints);
    }
}
