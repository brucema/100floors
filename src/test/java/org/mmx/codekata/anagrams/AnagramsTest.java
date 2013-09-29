package org.mmx.codekata.anagrams;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

public class AnagramsTest {
	
	@Test 
	public void output_one_when_input_one_char() {
		Anagrams sut = new Anagrams();
		
		Set<String> actualStringSet = sut.getAnagrams("a");
		
		assertReflectionEquals(new HashSet<String>(Arrays.asList("a")), actualStringSet, ReflectionComparatorMode.LENIENT_ORDER);
	}
	
	@Test 
	public void output_two_when_input_two_different_char() {
		Anagrams sut = new Anagrams();
		
		Set<String> actualStringSet = sut.getAnagrams("ab");
		
		assertReflectionEquals(new HashSet<String>(Arrays.asList("ab", "ba")), actualStringSet, ReflectionComparatorMode.LENIENT_ORDER);
	}
	
	@Test 
	public void output_six_when_input_three_different_char() {
		Anagrams sut = new Anagrams();
		
		Set<String> actualStringSet = sut.getAnagrams("abc");
		
		assertReflectionEquals(new HashSet<String>(Arrays.asList("abc", "bac", "bca", "cba", "acb", "cab")), actualStringSet, ReflectionComparatorMode.LENIENT_ORDER);
	}
	
	@Test 
	public void output_one_when_input_three_same_char() {
		Anagrams sut = new Anagrams();
		
		Set<String> actualStringSet = sut.getAnagrams("aab");
		
		assertReflectionEquals(new HashSet<String>(Arrays.asList("aab", "aba", "baa")), actualStringSet, ReflectionComparatorMode.LENIENT_ORDER);
	}
	
	@Test 
	public void output_when_input_four_different_char() {
		Anagrams sut = new Anagrams();
		
		Set<String> actualStringSet = sut.getAnagrams("biro");
		
		assertReflectionEquals(new HashSet<String>(Arrays.asList("biro", "bior", "brio", "broi", "boir", "bori",
				"ibro", "ibor", "irbo", "irob", "iobr", "iorb",
				"rbio", "rboi", "ribo", "riob", "roib", "robi",
				"obir", "obri", "oibr", "oirb", "orbi", "orib")), actualStringSet, ReflectionComparatorMode.LENIENT_ORDER);
	}
	
	
}
