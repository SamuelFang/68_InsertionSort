public class InsertionSort {
    private static List_inArraySlots list;

    public static void insertionSort (List_inArraySlots list){
        for (int amountSorted = 1; amountSorted < list.size(); amountSorted++){
            for (int currentPosition = amountSorted; currentPosition > 0; currentPosition--){
                if (list.get(currentPosition) < list.get(currentPosition - 1)){
                    int higherValue = list.get(currentPosition - 1);
                    list.set(currentPosition - 1, list.get(currentPosition));
                    list.set(currentPosition, higherValue);
                }
                else break;
            }
        }
    }
}
