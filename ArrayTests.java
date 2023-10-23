import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
    double[] input2 = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.001);
    double[] input3 = {1.0, 2.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3), 0.001);
    double[] input4 = {1.0, 1.0, 2.0};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input4), 0.001);
    double[] input5 = {1.0, 1.0, 1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input5), 0.001);
  }
}
