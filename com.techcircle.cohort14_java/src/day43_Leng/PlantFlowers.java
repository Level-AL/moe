package day43_Leng;

public class PlantFlowers {
	/*
	 * [0,0,0] ,
	 * 
	 */
	public static void main(String[] args) {
		int result = countFlowerSpace(new int[] { 0, 0, 0, 0, 0, 0, 0 });
		System.out.println(result);
	}

	public static boolean canPlantFlowers(int[] flowerBed, int numberOfFlowers) {
		return false;
	}

	public static int countFlowerSpace(int[] flowerBed) {
		int count = 0;

		// first & last space are exception
		// {0,0 0,0}
		for (int i = 0; i < flowerBed.length - 1; i++) {
			// {0,0, ......
			if (i == 0 || i == flowerBed.length - 2) {

				if (flowerBed[i] == 0 && flowerBed[i + 1] == 0) {
					count++;
				} else {
					if (flowerBed[i - 1] == 0 && flowerBed[i] == 0 && flowerBed[i + 1] == 0) {
						count++;
						i++;
					}
				}
				// ..., 0,0}

			}
		}

		return count;
	}
}
