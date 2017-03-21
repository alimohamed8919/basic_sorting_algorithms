import java.util.Arrays;

public class Driver implements DriverInterface {

	BubbleSort bubSort = new BubbleSort();
	SelectionSort selSort = new SelectionSort();
	InsertionSort inSort = new InsertionSort();


	@Override
	public Integer[] createArray(ArrayType arrayType, int arraySize) {

		Integer[] listOfObjects = new Integer[arraySize];
		int ranNum = (int) (1 + Math.random() * listOfObjects.length);

		switch(arrayType) {
		case Equal: //Equal
			for (int i = 0; i < listOfObjects.length; i++) {
				listOfObjects[i] = ranNum;
			}break;

		case Random: //Random
			for (int j = 0; j < listOfObjects.length; j++) {
				listOfObjects[j] = (int) (1 + Math.random() * listOfObjects.length);
			}break;

		case Increasing: //Increasing
			for (int k = 1; k < listOfObjects.length + 1; k++) {
				listOfObjects[k - 1] = k;
			}break;

		case Decreasing: //Decreasing
			for (int l = listOfObjects.length; l <= listOfObjects.length; l--) {
				listOfObjects[listOfObjects.length - l] = l;
				if (l <= 1) {
					break;
				}
			}break;

		case IncreasingAndRandom: //Increasing and Random
			for (int m = 1; m < listOfObjects.length + 1; m++) {
				if(m > .9 * listOfObjects.length) {
					listOfObjects[m - 1] = (int) (1 + Math.random() * listOfObjects.length);
				}else
					listOfObjects[m - 1] = m;
			}break;

		default:
			break;

	}

		return listOfObjects;
	}

	@Override
	public RunTime runSort(SortType sortType, ArrayType arrayType, int arraySize, int numberOfTimes) {

		switch(sortType) {
		case BubbleSort:
			bubSort.resetRunTimes();
			for (int i = 0; i < numberOfTimes; i++) {
				Integer [] listOfObjects = this.createArray(arrayType, arraySize);
				bubSort.sort(listOfObjects);
			}
			System.out.println(sortType + ", " + arrayType + ", " + arraySize);
			System.out.println("-------------------------------------------------------------");
			System.out.println(Arrays.toString(bubSort.getRunTimes()) + " --- " + bubSort.getAverageRunTime() + "\n");
			return bubSort;

		case SelectionSort:
			selSort.resetRunTimes();
			for (int i = 0; i < numberOfTimes; i++) {
				Integer [] listOfObjects = this.createArray(arrayType, arraySize);
				selSort.sort(listOfObjects);
			}
			System.out.println(sortType + ", " + arrayType + ", " + arraySize);
			System.out.println("-------------------------------------------------------------");
			System.out.println(Arrays.toString(selSort.getRunTimes()) + " --- " + selSort.getAverageRunTime() + "\n");
			return selSort;

		case InsertionSort:
			inSort.resetRunTimes();
			for (int i = 0; i < numberOfTimes; i++) {
				Integer [] listOfObjects = this.createArray(arrayType, arraySize);
				inSort.sort(listOfObjects);
			}
			System.out.println(sortType + ", " + arrayType + ", " + arraySize);
			System.out.println("-------------------------------------------------------------");
			System.out.println(Arrays.toString(inSort.getRunTimes()) + " --- " + inSort.getAverageRunTime() + "\n");
			return inSort;

		default:
		return null;
	}

		
	}

	public static void main(String[] args) {

		Driver dObj = new Driver();

		dObj.runSort(SortType.BubbleSort, ArrayType.Equal, 1000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Equal, 1000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Equal, 1000, 10);
		dObj.runSort(SortType.BubbleSort, ArrayType.Equal, 10000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Equal, 10000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Equal, 10000, 10);

		dObj.runSort(SortType.BubbleSort, ArrayType.Random, 1000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Random, 1000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Random, 1000, 10);
		dObj.runSort(SortType.BubbleSort, ArrayType.Random, 10000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Random, 10000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Random, 10000, 10);

		dObj.runSort(SortType.BubbleSort, ArrayType.Increasing, 1000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Increasing, 1000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Increasing, 1000, 10);
		dObj.runSort(SortType.BubbleSort, ArrayType.Increasing, 10000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Increasing, 10000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Increasing, 10000, 10);

		dObj.runSort(SortType.BubbleSort, ArrayType.Decreasing, 1000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Decreasing, 1000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Decreasing, 1000, 10);
		dObj.runSort(SortType.BubbleSort, ArrayType.Decreasing, 10000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.Decreasing, 10000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.Decreasing, 10000, 10);

		dObj.runSort(SortType.BubbleSort, ArrayType.IncreasingAndRandom, 1000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.IncreasingAndRandom, 1000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.IncreasingAndRandom, 1000, 10);
		dObj.runSort(SortType.BubbleSort, ArrayType.IncreasingAndRandom, 10000, 10);
		dObj.runSort(SortType.SelectionSort, ArrayType.IncreasingAndRandom, 10000, 10);
		dObj.runSort(SortType.InsertionSort, ArrayType.IncreasingAndRandom, 10000, 10);




	}
}
