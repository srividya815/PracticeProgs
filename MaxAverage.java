package com.vids.may18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class MaxAverage {

	private static void printMaxAvg(String[][] input) {

		Map<String, List<Integer>> studentMarksMap = new HashMap<>();
		for (String[] current : input) {

			String student = current[0];
			int marks = Integer.parseInt(current[1]);

			if (studentMarksMap.containsKey(student)) {
				List<Integer> marksList = studentMarksMap.get(student);
				marksList.add(marks);
			} else {
				// create new arrayList and add the student
				List<Integer> marksList = new ArrayList<>();
				marksList.add(marks);
				studentMarksMap.put(student, marksList);
			}
		}

		String maxAvgStudent = "";
		double maxAvg = 0.0;
		for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {

			List<Integer> tempList = entry.getValue();
			OptionalDouble average = tempList.stream().mapToDouble(a -> a).average();
			if (average.getAsDouble() > maxAvg) {
				maxAvg = average.getAsDouble();
				maxAvgStudent = entry.getKey();
			}
		}
		System.out.println("student-" + maxAvgStudent + "\t Avg is-" + maxAvg);
	}

	public static void main(String[] args) {
		String inputArray[][] = new String[4][2];
		inputArray[0] = new String[] { "Abc", "80" };
		inputArray[1] = new String[] { "Xyz", "60" };
		inputArray[2] = new String[] { "Pqr", "65" };
		inputArray[3] = new String[] { "Abc", "86" };
		printMaxAvg(inputArray);
	}

}
