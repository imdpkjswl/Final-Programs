
import java.util.*;


class Interval {

	int start, end;
	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class Merge_Overlapping_Subinterval {

	public static List<Interval> mergeIntervals(List<Interval> intervals) {
		if (intervals == null || intervals.size() <= 1) {
			return intervals;
		}

		Collections.sort(intervals, Comparator.comparing((Interval itl)->itl.start));

		List<Interval> result = new ArrayList<>();
		Interval t = intervals.get(0); // pick the first sorted interval.

		for (int i = 1; i < intervals.size(); i++) {
			Interval c = intervals.get(i);
			if (c.start <= t.end) {
				t.end = Math.max(t.end, c.end);
			} else {
				result.add(t);
				t = c;
			}
		}

		result.add(t);

		return result;
	}

	public static void main(String[] args) {

		// Given intervals might be unorder
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(6, 8));
		list.add(new Interval(11, 18));
		list.add(new Interval(12, 19));
		list.add(new Interval(1, 9));
		list.add(new Interval(2, 4));
		list.add(new Interval(4, 7));

		List<Interval> result = mergeIntervals(list);

		System.out.println("Merged non-overlapped intervals are:");
		for (int i = 0; i < result.size(); i++) {
			System.out.println("(" + result.get(i).start + ", " + result.get(i).end + ")");
		}


	}

}