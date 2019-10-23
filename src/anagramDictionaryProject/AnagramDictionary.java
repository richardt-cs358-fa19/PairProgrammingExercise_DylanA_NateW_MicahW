package anagramDictionaryProject;

import java.util.*;
import java.util.AbstractList;

public class AnagramDictionary {
	Vector<Vector<String>> mDictionary;
	Vector<String> mKeys;
	
	private String sortWord(String word) {
		char tempArray[] = word.toCharArray();
		Arrays.parallelSort(tempArray);
		return new String(tempArray);
	}
	
	public String addWord(String word) {
		String sorted_word = sortWord(word.toLowerCase());
		
		Iterator value = mDictionary.iterator();
		
		while(value.hasNext()) {
			
		}
	}
}
