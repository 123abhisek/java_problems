package Problems;

public class Left_Rotate_Matrix_K_times {
	public static int[][] rotateMatrix(int k, int mat[][]) {

		for (int[] is : mat) {
			int temp = is[0];
			int i = 1, j = 0;
			while (i < is.length) {
				is[j] = is[i];
				i++;
				j++;
			}
			is[is.length - 1] = temp;
		}

		return mat;
	}

	public static void main(String[] args) {

		int k = 1;
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		mat = rotateMatrix(k, mat);

		for (int[] is : mat) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}

}
