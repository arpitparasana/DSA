package com.dsa.challenge;

import java.util.HashMap;
import java.util.Map;

public class TwoSumChallenge {

	public static void main(String[] args) {
		int[] values = new int[] { 3, -6, 8, 4, 2, 9, 7, };
		int[] result = getTowSumIndices(values, 3);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] getTowSumIndices(int[] values, int target) {
		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();

		for (int i = 0; i < values.length; i++) {
			if (visited.containsKey(target - values[i])) {
				return new int[] { visited.get(target - values[i]), i };
			}
			visited.put(values[i], i);
		}
		return new int[] { -1, -1 };

	}
}
