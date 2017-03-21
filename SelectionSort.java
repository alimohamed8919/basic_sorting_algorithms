public class SelectionSort extends RunTime implements SortInterface {

	@Override
	public void sort(Integer[] arrayToSort) {

		long startTime = System.nanoTime();

		int n = arrayToSort.length;
		int tempHolder;

		for (int j = 0; j < n - 1; j++) {
			int iMin = j;
			for (int i = j + 1; i < n; i++) {
				if (arrayToSort[i] < arrayToSort[iMin]) {
					iMin = i;
				}
			}
			if (iMin != j) {
				tempHolder = arrayToSort[j];
				arrayToSort[j] = arrayToSort[iMin];
				arrayToSort[iMin] = tempHolder;

			}
		}


		long endTime = System.nanoTime();
		long runTime = endTime - startTime;

		this.addRuntime(runTime);

	}

}
