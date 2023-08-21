package Interview_programs;

import java.util.HashMap;

public class RepeatCharacter_Count {

	public static void main(String[] args) {
		
		String name="Asish Kumar Padhi";
		char[] arr = name.replace(" ", "").toCharArray();
		HashMap<Character, Integer> hm=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		for(Character ch:hm.keySet()) {
			if(hm.get(ch)>1) {
				System.out.println(ch+" is repated "+hm.get(ch)+" times");
			}
		}

	}

}
