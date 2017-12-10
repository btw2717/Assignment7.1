public class Sortie {
	public static String sort(double[] num) {
		String sorted = "";

		for(int j=0;j<num.length;j++) {
			double small = num[j];
			int smallIndex = j;

			for(int i=j+1;i<num.length;i++) {
				if(small>num[i]) {
					small = num[i];
					smallIndex = i;
				}
			}
			if(j != smallIndex) {
				swap(j, smallIndex, num);
			}
		}
		for(double value:num) {
			sorted += value + " ";
		}
		return sorted;
	}
	public static void swap(int oldSmallIndex, int newSmallIndex, double[] num) {
		double temp = num[newSmallIndex];
		num[newSmallIndex] = num[oldSmallIndex];
		num[oldSmallIndex] = temp;
	}
}
