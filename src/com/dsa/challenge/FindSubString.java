package com.dsa.challenge;

public class FindSubString {

	public static void main(String[] args) {
		String searchMe = "Look for a substring in me";

		System.out.println(containsSubString(searchMe, "sub"));
		System.out.println(containsSubString(searchMe, "sub1"));
		
		System.out.println(containsSubString(searchMe, "me"));
		System.out.println(containsSubString(searchMe, "me "));
	}

	private static boolean containsSubString(String searchMe, String substring) {
		boolean foundIt = false;

		int sL = searchMe.length() - substring.length() + 1;

		substring: for (int i = 0; i < sL; i++) {
			if (searchMe.charAt(i) == substring.charAt(0)) {
				for (int j = 0; j < substring.length(); j++) {
					if (searchMe.charAt(j + i) != substring.charAt(j)) {
						continue substring;
					}
				}
				foundIt = true;
			}
			if (foundIt) {
				break;
			}
		}
		return foundIt;
	}

}
