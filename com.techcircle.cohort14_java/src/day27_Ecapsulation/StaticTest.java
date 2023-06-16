package day27_Ecapsulation;

public class StaticTest {
	public static void main(String[] args) {

		int value = AnanasClass.maxPlayer;
		String value2 = AnanasClass.name;

		AnanasClass sm = new AnanasClass();

		int value3 = sm.num;

		AnanasClass.displayStaticMessage();

		sm.displayMessage();

		AnanasClass.maxPlayer = 4;
		AnanasClass.name = "Java";
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println(AnanasClass.maxPlayer);
		System.out.println(AnanasClass.name);
		
		
	}
}
