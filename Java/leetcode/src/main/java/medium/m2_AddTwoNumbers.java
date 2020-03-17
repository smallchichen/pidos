package medium;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

class m2_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode tail = new ListNode(0);
		ListNode result = tail;

		int carry = 0;
		while (l1 != null || l2 != null || carry == 1) {
			int sum = carry;
			carry = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			if (sum > 9) {
				carry = 1;
				sum -= 10;
			}
			tail.next = new ListNode(sum);
			tail = tail.next;
		}
		return result.next;
	}

//	public static void main(String[] args) {
//		ListNode l1 = new ListNode(2);
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(3);
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
//		m2_AddTwoNumbers test = new m2_AddTwoNumbers();
//		ListNode l3 = test.addTwoNumbers(l1, l2);
//		System.out.println(new Gson().toJson(l3));
//	}
}
