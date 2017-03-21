public class BubbleSort extends RunTime implements SortInterface {

	@Override
	public void sort(Integer[] arrayToSort) {

		long startTime = System.nanoTime();

		int n = arrayToSort.length;
		int tempHolder;

		do {
			int newn = 0;
			for(int j = 1; j < n; j++) {
					if (arrayToSort[j - 1] > arrayToSort[j]) {
						tempHolder = arrayToSort[j];
						arrayToSort[j] = arrayToSort[j - 1];
						arrayToSort[j - 1] = tempHolder;
						newn = j;

					}
			}
			n = newn;
		}while (n > 0);

		long endTime = System.nanoTime();
		long runTime = endTime - startTime;

		this.addRuntime(runTime);


	}

}
