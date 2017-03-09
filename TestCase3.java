package failedtestcases;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3
{
	@Test
	public void test3()
	{
		Assert.assertTrue(false);
		System.out.println("hello");
	}

}
