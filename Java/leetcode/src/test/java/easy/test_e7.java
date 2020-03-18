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
public class test_e7 {

	private e7_ReverseInteger test;
	private int input;
	private int expectedOutput;

	public test_e7(int input, int expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		params.add(new Object[] { 123, 321 });
		params.add(new Object[] { -123, -321 });
		params.add(new Object[] { 120, 21 });
		return params;
	}

	@Before
	public void createTest() {
		test = new e7_ReverseInteger();
	}

	@Test
	public void evaluatesExpression() {
		System.out.println(test.reverse(input));
		assertEquals(expectedOutput, test.reverse(input));
	}

	@After
	public void endTest() {
		test = null;
		input = 0;
		expectedOutput = 0;
	}
}
