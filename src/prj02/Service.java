package prj02;

import java.util.ArrayList;
import java.util.HashMap;

public class Service {

	public static HashMap<String, HashMap<String, Integer>> priceSearch(ArrayList<Integer> numbers) {
		HashMap<String, HashMap<String, Integer>> resultMap = new HashMap<String, HashMap<String, Integer>>();
		ArrayList<String> months = new ArrayList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");
		Integer prodNumber = 1;
		Integer priceIndex = 0;
		while (priceIndex < numbers.size()) {
			HashMap<String, Integer> mapByMonth = new HashMap<String, Integer>();
			for (String month : months) {
				if (priceIndex >= numbers.size()) {
					break;
				}
				mapByMonth.put(month, numbers.get(priceIndex));
				priceIndex++;
			}
			resultMap.put("Prod " + prodNumber, mapByMonth);
			prodNumber++;
		}
		return resultMap;
	}
}
