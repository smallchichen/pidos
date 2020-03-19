package easy;

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
public class test_e9 {

	private e9_PalindromeNumber test;
	private int input;
	private boolean expectedOutput;

	public test_e9(int input, boolean expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		params.add(new Object[] { 121, true });
		params.add(new Object[] { -123, false });
		params.add(new Object[] { 120, false });
		return params;
	}

	@Before
	public void createTest() {
		test = new e9_PalindromeNumber();
	}

	@Test
	public void evaluatesExpression() {
		System.out.println(test.isPalindrome(input));
		assertEquals(expectedOutput, test.isPalindrome(input));
	}

	@After
	public void endTest() {
		test = null;
		input = 0;
		expectedOutput = false;
	}
}
