package stringpermutation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PermutationStringTest {

	@Test
	public void test() {
		
		PermutationString.permute("GOD", 0,2);
		
		PermutationString.permute("abc", 0,2);
	}

}
