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
public class test_h4 {

	private h4_MedianofTwoSortedArrays test;

	private int[] input1;
	private int[] input2;
	private double expectedOutput;

	public test_h4(int[] input1, int[] input2, double expectedOutput) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		int[] i1 = { 1, 3 };
		int[] i2 = { 2 };
		params.add(new Object[] { (Object) i1, (Object) i2, 2.0 });
		int[] i3 = { 1, 2 };
		int[] i4 = { 3, 4 };
		params.add(new Object[] { (Object) i3, (Object) i4, 2.5 });		
		return params;
	}

	@Before
	public void createTest() {
		test = new h4_MedianofTwoSortedArrays();
	}

	@Test
	public void evaluatesExpression() {
		System.out.println(expectedOutput);
		System.out.println(test.findMedianSortedArrays(input1, input2));
		assertEquals(new Gson().toJson(expectedOutput), new Gson().toJson(test.findMedianSortedArrays(input1, input2)));
	}

	@After
	public void endTest() {
		test = null;
		input1 = null;
		input2 = null;
		expectedOutput = 0;
	}
}
