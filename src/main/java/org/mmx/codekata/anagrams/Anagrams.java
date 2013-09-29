package org.mmx.codekata.anagrams;

import java.util.HashSet;
import java.util.Set;

public class Anagrams {

	public Set<String> getAnagrams(String inputStr) {
		Set<String> result = new HashSet<String>();
		
//		if (inputStr.length() == 2) {
//			result.add(inputStr);
//			result.add(StringUtils.reverse(inputStr));
//		}
		
		char[] charStr = inputStr.toCharArray();
		if (charStr.length == 1) {
			result.add(new String(charStr));
		} else if (charStr.length >= 2){
			for (int i = 0; i < charStr.length; i++) {
				Set<String> subAnagrams = getAnagrams(inputStr.substring(0, i) + inputStr.substring(i+1));
				for (String subAnagram : subAnagrams) {
					result.add(subAnagram + charStr[i]);
				}
			}
		}
		
//		result.add(inputStr);
		return result;
	}

}
