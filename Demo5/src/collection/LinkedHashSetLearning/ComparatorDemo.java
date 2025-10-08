package collection.LinkedHashSetLearning;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int a = (int) o1;
		int b = (int) o2;
		if (a > b) {
			return -1;
		} else if (a < b) {
			return +1;
		}
		return 0;
	}

}
