package NumberRangeSummarizer;

// Import libries 

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

// Test method

public class NumberRangeSummarizerImplTest {

    private NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();

    @Test
    public void collectTest(){
        List<Integer> expectedCollectIntegers = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        List<Integer> actualIntegers = new ArrayList<>(numberRangeSummarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31"));

        for(int i=0; i< actualIntegers.size(); i++) {
            assertEquals(expectedCollectIntegers.get(i), actualIntegers.get(i));
        }

    }

    @Test
    public void summarizeCollectionTest() {

        Collection<Integer> input = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        String actual = numberRangeSummarizer.summarizeCollection(input);
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";
        assertEquals(expected, actual);
    }

}