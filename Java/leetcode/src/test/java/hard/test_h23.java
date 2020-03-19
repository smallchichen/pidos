package hard;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.gson.Gson;

@RunWith(Parameterized.class)
public class test_h23 {

	private h23_MergekSortedLists test;

	private ListNode[] input1;
	private ListNode expectedOutput;

	public test_h23(ListNode[] input1, ListNode expectedOutput) {
		super();
		this.input1 = input1;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		ListNode[] list = new ListNode[3];
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		list[0] = l1;
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		list[1] = l2;

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		list[2] = l3;

		ListNode l4 = new ListNode(1);
		l4.next = new ListNode(1);
		l4.next.next = new ListNode(2);
		l4.next.next.next = new ListNode(3);
		l4.next.next.next.next = new ListNode(4);
		l4.next.next.next.next.next = new ListNode(4);
		l4.next.next.next.next.next.next = new ListNode(5);
		l4.next.next.next.next.next.next.next = new ListNode(6);
		
		params.add(new Object[] { list , l4 });
		return params;
	}

	@Before
	public void createTest() {
		test = new h23_MergekSortedLists();
	}

	@Test
	public void evaluatesExpression() {
//		System.out.println(new Gson().toJson(expectedOutput));
//		System.out.println(new Gson().toJson(test.mergeKLists(input1)));
		assertEquals(new Gson().toJson(expectedOutput), new Gson().toJson(test.mergeKLists(input1)));
	}

	@After
	public void endTest() {
		test = null;
		input1 = null;
		expectedOutput = null;
	}
}
