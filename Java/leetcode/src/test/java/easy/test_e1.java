package easy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test_e1 {

	@Test
	public void evaluatesExpression()
    {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		e1_TwoSum test = new e1_TwoSum();
		int[] sum = test.twoSum(nums, target);
		int[] expression = {0,1};
		
		assertArrayEquals(expression, sum);
//		assertEquals(expression[0], sum[0]);
//		assertEquals(expression[1], sum[1]);
    }
}
