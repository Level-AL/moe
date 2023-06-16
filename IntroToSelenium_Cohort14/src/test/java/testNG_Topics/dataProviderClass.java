package testNG_Topics;

import org.testng.annotations.DataProvider;

public class dataProviderClass {

	
	@DataProvider (name = "dpMethod")
	public Object [] [] dpMethod (){
		
		return  new Object[][] {{"Bart", "Smith",79}, { "Alex","Abi-Aad",78}};
		
	}
	
	@DataProvider (name = "abcMethod")
	public Object [] [] abcMethod (){
		
		
		return new Object[][] {{"Bart",79}, {"Milad",30},{"Syed",87}};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
