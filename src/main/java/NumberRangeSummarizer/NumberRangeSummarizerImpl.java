package NumberRangeSummarizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {
    @Override
    public List<Integer> collect(String input) {
        int[] integers = Arrays.stream(input.split(",")).map(Integer::parseInt).mapToInt(i -> i).toArray();

        return Arrays.stream(integers).boxed().collect(Collectors.toList());
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        List<Integer> integerList = new ArrayList<>(input);
        StringBuilder summary = new StringBuilder();

        for (int i = 0; i < integerList.size(); i++) {
            if (i == 0) {
                summary.append(integerList.get(i));
            } else if ((integerList.get(i - 1) == integerList.get(i) - 1) && ((i == integerList.size() - 1) || (integerList.get(i) + 1 != integerList.get(i + 1)))) {
                summary.append("-").append(integerList.get(i));
            } else if (!((i != integerList.size() - 1) && (integerList.get(i - 1) == integerList.get(i) - 1) && (integerList.get(i) + 1 == integerList.get(i + 1)))) {
                summary.append(", ").append(integerList.get(i));
            }

        }

        return summary.toString();
    }
}
