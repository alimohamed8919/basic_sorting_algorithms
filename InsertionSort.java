public class InsertionSort extends RunTime implements SortInterface {

	@Override
	public void sort(Integer[] arrayToSort) {

		long startTime = System.nanoTime();
		int tempHolder;

		for (int i = 1; i < arrayToSort.length; i++) {
			int x = arrayToSort[i];
			int j = i - 1;

			while (j >= 0 && arrayToSort[j] > x) {
				tempHolder = arrayToSort[j + 1];
				arrayToSort[j + 1] = arrayToSort[j];
				arrayToSort[j] = tempHolder;
				j -= 1;
			}
			arrayToSort[j + 1] = x;

		}



		long endTime = System.nanoTime();
		long runTime = endTime - startTime;

		this.addRuntime(runTime);

	}

}
