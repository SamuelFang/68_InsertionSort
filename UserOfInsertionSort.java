public class UserOfInsertionSort {
	public static void main(String[] commandLine) {
		List_inArraySlots list = new List_inArraySlots();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(9);
		System.out.println("old: " + list);
		InsertionSort.insertionSort(list);
		System.out.println("new: " + list);
	}
}
