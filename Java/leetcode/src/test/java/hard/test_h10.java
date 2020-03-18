package hard;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.gson.Gson;

@RunWith(Parameterized.class)
public class test_h10 {

	private h10_RegularExpressionMatching test;

	private String input1;
	private String input2;
	private boolean expectedOutput;

	public test_h10(String input1, String input2, boolean expectedOutput) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
//		params.add(new Object[] { "aa", "a", false });
//		params.add(new Object[] { "aa", "a*", true });
//		params.add(new Object[] { "ab", ".*", true });
		params.add(new Object[] { "aab", "c*a*b", true });
//		params.add(new Object[] { "mississippi", "mis*is*p*.", false });
		return params;
	}

	@Before
	public void createTest() {
		test = new h10_RegularExpressionMatching();
	}

	@Test
	public void evaluatesExpression() {
//		System.out.println(expectedOutput);
//		System.out.println(test.isMatch(input1, input2));
		assertEquals(expectedOutput, test.isMatch(input1, input2));
	}

	@After
	public void endTest() {
		test = null;
		input1 = null;
		input2 = null;
		expectedOutput = false;
	}
}
