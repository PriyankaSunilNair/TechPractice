class Solution {
    public void moveZeroes(int[] arr) {
		if (arr.length < 2) return;
		int i = 0, j = 1;
		while (i < arr.length && j < arr.length) {
			if (arr[i] == 0 && arr[j] != 0) {
				arr[i] = arr[j];
				arr[j] = 0;
			}
			if (arr[i] != 0 && arr[j] != 0) {
				i++; j++;
				continue;
			}
			if (arr[i] != 0) i++;
			if (arr[j] == 0) j++;
		}
    }
}