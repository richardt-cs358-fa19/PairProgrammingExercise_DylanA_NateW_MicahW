package anagramDictionaryProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void addWordTest() {
		AnagramDictionary dict = new AnagramDictionary();
		String key = dict.addWord("abc");
		assertEquals("abc", key);
	}
	
	@Test
	void addWordTestAnagramTest() {
		AnagramDictionary dict = new AnagramDictionary();
		String key = dict.addWord("cba");
		assertEquals("abc", key);
	}
	
	@Test
	void addWordTestAnagramCaptializeTest() {
		AnagramDictionary dict = new AnagramDictionary();
		String key = dict.addWord("bCa");
		assertEquals("abc", key);
	}
}
