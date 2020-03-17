package medium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.text.AbstractDocument.LeafElement;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.gson.Gson;

@RunWith(Parameterized.class)
public class test_m1 {

	private m2_AddTwoNumbers test;

	private ListNode input1;
	private ListNode input2;
	private ListNode expectedOutput;

	public test_m1(ListNode input1, ListNode input2, ListNode expectedOutput) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(7);
		l3.next = new ListNode(0);
		l3.next.next = new ListNode(8);
		
		params.add(new Object[] { l1, l2, l3 });
		return params;
	}

	@Before
	public void createTest() {
		test = new m2_AddTwoNumbers();
	}
//JSONObject 只會比較記憶的位置
	@Test
	public void evaluatesExpression() {
//		System.out.println(new JSONObject(expectedOutput));
//		System.out.println(new JSONObject(test.addTwoNumbers(input1, input2)));
		assertEquals(new Gson().toJson(expectedOutput), new Gson().toJson(test.addTwoNumbers(input1, input2)));
	}

	@After
	public void endTest() {
		test = null;
		input1 = null;
		input2 = null;
		expectedOutput = null;
	}
}
