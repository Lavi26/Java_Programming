package stringpermutation;

import org.junit.Test;

public class PermutationStringTest {

	@Test
	public void test1() {
		
		PermutationString.permute("GOD", 0,2);
		
		PermutationString.permute("abc", 0,2);
	}
	
	@Test
    public void test2() {
        PermutationString.permute("java", 0,3);
    }

}
