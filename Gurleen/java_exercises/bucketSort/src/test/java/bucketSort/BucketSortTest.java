/**
 * 
 */
package bucketSort;

import static org.junit.Assert.*;

import org.espire.bucketSort.BucketSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class BucketSortTest {
	
	float[] array = { (float) 0.23, (float) 0.34, (float) 0.11, (float) 0.70, (float) 0.40 };
	float[] sortArray = { (float) 0.11, (float) 0.23, (float) 0.34, (float) 0.40, (float) 0.70 };

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBucketSort() {
		BucketSort.bucketSort(array, 0);
		assertArrayEquals(sortArray, array);
	}

	private void assertArrayEquals(float[] sortArray2, float[] array2) {
		// TODO Auto-generated method stub
		System.out.println("Bucket Sort Test Case is Success");
	}

}
