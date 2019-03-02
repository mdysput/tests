package MDtest;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {

    private Utilities util;

    private String input;
    private String output;

    public UtilitiesTestParametrized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @org.junit.Before
    public void setup(){
        util= new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"ABBBEFGG", "ABEFG"},
                {"112233345", "12345"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals(output, util.removePairs(input));
    }
}
