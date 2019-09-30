import java.util.Arrays;
import java.util.List;

public class PeakFinding1D {
    public static void main(String[] args) {
        System.out.println(peak(Arrays.asList(2, 7, 9, 10)));
        System.out.println(peak(Arrays.asList(2, 7, 9, 4)));
        System.out.println(peak(Arrays.asList(3, 2, 1, 1)));

    }

    private static int peak(final List<Integer> input) {
        return peak(input, 0, input.size() - 1);
    }

    //Log N
    private static int peak(final List<Integer> input, int start, int end) {
        final int mid = (start + end) / 2;
        if (mid - 1 >= 0 && input.get(mid - 1) > input.get(mid)) {
            return peak(input, start, mid - 1);
        } else if (mid + 1 <= input.size() - 1 && input.get(mid + 1) > input.get(mid)) {
            return peak(input, mid + 1, end);
        } else {
            return input.get(mid);
        }
    }
}
