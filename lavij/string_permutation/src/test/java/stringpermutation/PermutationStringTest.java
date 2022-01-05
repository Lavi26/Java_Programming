package stringpermutation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PermutationStringTest {

	@Test
	public void test1() {
		
		PermutationString.permute("GOD", 0,2);
		
		PermutationString.permute("abc", 0,2);
	}
	
	@Test
    public void test2() {
        
        PermutationString.permute("abcd", 0,3);
        
        PermutationString.permute("java", 0,3);
    }

}
