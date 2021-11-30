package NumberRangeSummarizer;

import java.util.Collection;

public class Test {

    public static void main(String[] args) {
        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> collectIntegers = numberRangeSummarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");

            System.out.println(numberRangeSummarizer.summarizeCollection(collectIntegers));


    }
}


