package testNG_Topics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Parameters({"param1","param2","param3"})
	@Test
	public void parameterTest(String name1 ) {
		
		System.out.println(name1);
		
	}
	
	
	
	
	
	
	
	
}
