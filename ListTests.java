import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class Checker implements StringChecker{
  public boolean checkString(String s){
    return s.contains("e");
  }
}

public class ListTests {
	@Test 
	public void testFilter() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
	}


  @Test
  public void testMerge() {
    String[] arr1 = {"A", "C", "E"};
    List<String> list1 = Arrays.asList(arr1);
    String[] arr2 = {"B", "D", "F"};
    List<String> list2 = Arrays.asList(arr2);
    String[] arr3 = {"A", "B", "C", "D", "E", "F"};
    List<String> expected = Arrays.asList(arr3);
    assertArrayEquals(ListExamples.merge(list1, list2).toArray(), expected.toArray());
  }

}
