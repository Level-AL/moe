package day11_nestedForLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {

		int timer = 15;

		System.out.println(timer + ":00");
		
		for (int minute = timer - 1; minute >= 0; minute--) {
		//System.out.println(minute);
			for (int second = 59; second >= 0; second--) {
				System.out.println(minute + ":" + second);

//				Thread.sleep(1000);

			}
		}
		  
		System.err.println("Time is up!!");
		
		
//		for (int hour = 2; hour>=0; hour--) {
//			for (int minute = timer - 1; minute >= 0; minute--) {
////				System.out.println(minute);
//					for (int second = 59; second >= 0; second--) {
//						System.out.println(minute + ":" + second);
//
//						Thread.sleep(10);
//
//					}
//				}
//			}
		
	
		
//		for (int day= 0; day >=0; day--) {
//			
//			for (int hour = 23; hour>=0; hour--) {
//				for (int minute = 59; minute >= 0; minute--) {
////					System.out.println(minute);
//						for (int second = 59; second >= 0; second--) {
//							System.out.println(minute + ":" + second);
//
//							//Thread.sleep(1000);
//
//						}
//					}
//				}

			
		}
		
		public void fifteenMinuteTimer ()  {
			int timer = 15;

			System.out.println(timer + ":00");
			
			for (int minute = timer - 1; minute >= 0; minute--) {
			//System.out.println(minute);
				for (int second = 59; second >= 0; second--) {
					System.out.println(minute + ":" + second);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
			  
			System.err.println("Time is up!!");
			
			
//			for (int hour = 2; hour>=0; hour--) {
//				for (int minute = timer - 1; minute >= 0; minute--) {
////					System.out.println(minute);
//						for (int second = 59; second >= 0; second--) {
//							System.out.println(minute + ":" + second);
	//
//							Thread.sleep(10);
	//
//						}
//					}
//				}
			
		
			
//			for (int day= 0; day >=0; day--) {
//				
//				for (int hour = 23; hour>=0; hour--) {
//					for (int minute = 59; minute >= 0; minute--) {
////						System.out.println(minute);
//							for (int second = 59; second >= 0; second--) {
//								System.out.println(minute + ":" + second);
	//
//								//Thread.sleep(1000);
	//
//							}
//						}
//					}

			
		}
		
	
	}

