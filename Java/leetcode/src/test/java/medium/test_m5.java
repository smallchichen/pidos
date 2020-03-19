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
public class test_m5 {

	private m5_LongestPalindromicSubstring test;
	private String input;
	private String expectedOutput;

	public test_m5(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		params.add(new Object[] { "babad", "bab" });
		params.add(new Object[] { "cbbd", "bb" });
		return params;
	}

	@Before
	public void createTest() {
		test = new m5_LongestPalindromicSubstring();
	}

	@Test
	public void evaluatesExpression() {
		System.out.println(test.longestPalindrome(input));
		assertEquals(expectedOutput, test.longestPalindrome(input));
	}

	@After
	public void endTest() {
		test = null;
		input = null;
		expectedOutput = null;
	}
}
