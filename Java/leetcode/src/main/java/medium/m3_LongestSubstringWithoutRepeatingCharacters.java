package medium;

import java.util.HashMap;

import com.google.gson.Gson;

class m3_LongestSubstringWithoutRepeatingCharacters {
	/**
	 *			p	w	w	k	e	w
	 *		i	0	1	2	3	4	5	位置0~n
	 *		j	0	0	2	2	2	3	一旦碰到就取map裡面的值(i+1=直到最新最大長度)
	 *		m	1	2	2	2	3	3	結果 i(位置) +1 -j = 重新計算最大長度 
	 * */
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		for (int i = 0, j = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
			System.out.print("i=" + i + ",j=" + j + ",max=" + max);
			System.out.println(new Gson().toJson(map));
		}
		return max;
	}
}
