package stringpermutation;

public class PermutationString {
    /*
     * To print all the permutations of a given string
     * */
	public static void permute(String str, int start, int last) {
		
		//print permutation
		if (start == last-1) {
			System.out.println(str);
		} else {
			for (int i = start; i < last; i++) {
				
				// swapping string by fixing a character
				str = swap(str, start, i);
				
				//recursively calling 
				permute(str, start + 1,last);
				
				//backtracking and swapping
				str = swap(str, start, i);
			}
		}
	}
    
	//function for swapping character at position
	public static String swap(String a, int i, int j) {
		
		char temp;
		char charArray[] = a.toCharArray();
		
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}

	public static void main(String args[]) {
		String str = "abc";

		PermutationString.permute(str, 0, str.length());
	}

}
