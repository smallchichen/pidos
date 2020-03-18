package medium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class test_m3 {

	private m3_LongestSubstringWithoutRepeatingCharacters test;
	private String input;
	private int expectedOutput;

	public test_m3(String input, int expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
//		params.add(new Object[] { "abcabcbb", 3 });
//		params.add(new Object[] { "bbbbb", 1 });
		params.add(new Object[] { "pwwkew", 3 });
		return params;
	}

	@Before
	public void createTest() {
		test = new m3_LongestSubstringWithoutRepeatingCharacters();
	}

	@Test
	public void evaluatesExpression() {
		System.out.println(test.lengthOfLongestSubstring(input));
		assertEquals(expectedOutput, test.lengthOfLongestSubstring(input));
	}

	@After
	public void endTest() {
		test = null;
		input = null;
		expectedOutput = 0;
	}
}
