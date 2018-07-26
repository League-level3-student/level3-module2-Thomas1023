package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while(true) {
		 for (int i = 1; i < array.length; i++) {
			    if (array[i - 1] > array[i]) {
			      int o = array[i];
			      array[i] = array[i - 1];
			      array[i - 1] = o;
			    } 
			    display.updateDisplay();
			  }
		}
	}
	
}
