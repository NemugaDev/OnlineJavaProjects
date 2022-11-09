package q_two;

public class SpiralArray {
	int array_size = 3;

	int w = array_size;

	public static void main(String[] args) {
		new SpiralArray().generateSpiralArray();
	}

	/**
	 * 0  1  2  3  4 
	 * 15 16 17 18 5 
	 * 14 23 24 19 6 
	 * 13 22 21 20 7 
	 * 12 11 10 9  8
	 */
	void generateSpiralArray() {

		int spiral[][] = new int[array_size][array_size];

		int counter = 1;
		int startCol = 0;
		int endCol = array_size - 1;
		int startRow = 0;
		int endRow = array_size - 1;
		while (array_size > 0) {
			for (int i = startCol; i <= endCol; i++) {
				spiral[startRow][i] = counter;
				counter++;
			}
			startRow++;
			for (int j = startRow; j <= endRow; j++) {
				spiral[j][endCol] = counter;
				counter++;
			}

			endCol--;

			for (int i = endCol; i >= startCol; i--) {
				spiral[endRow][i] = counter;
				counter++;
			}

			endRow--;
			for (int i = endRow; i >= startRow; i--) {
				spiral[i][startCol] = counter;
				counter++;
			}

			startCol++;
			array_size--;

		}
		for (int x = 0; x < spiral.length; x++) {

			for (int y = 0; y < spiral[x].length; y++) {
				System.out.print(spiral[x][y] + "  ");
			}
			System.out.println();
		}
		

	}
}
