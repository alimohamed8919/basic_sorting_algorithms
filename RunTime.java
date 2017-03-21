public class RunTime implements RuntimeInterface {

	private long runTimes[] = new long[10];
	private int index = 0;
	private double sum = 0;
	private double average = 0;

	@Override
	public long getLastRunTime() {
		if (runTimes[index] == 0) {
			return runTimes[index - 1];
		}else {
			return 0;
		}
	}

	@Override
	public long[] getRunTimes() {
		long getRunTimes[] = runTimes;
		return getRunTimes;
	}

	@Override
	public void resetRunTimes() {
		for (int i = 0; i < runTimes.length; i++)
			runTimes[i] = 0;
		index = 0;
		sum = 0;
	}

	@Override
	public void addRuntime(long runTime) {
		if (index < runTimes.length) {
			runTimes[index] = runTime;
			index++;
		}else {
			for (int i = 0 ; i < runTimes.length - 1; i++) {
				runTimes[i] = runTimes[i + 1];
			}
			runTimes[9] = runTime;
		}
	}

	@Override
	public double getAverageRunTime() {
		for (index = 0; index < runTimes.length; index++) {
			if (runTimes[index] > 0) {
				sum += runTimes[index];
			}
		}
		average = sum / index;

		return average;
	}

}
