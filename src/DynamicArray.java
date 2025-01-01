public class DynamicArray {
    public DynamicArray(){}

    public boolean isFull(int usedCells, int arrayLength){
        return (usedCells <= (0.6667 * arrayLength));
    }

    public int[] isArrayFull(int[] array){
        int[] newArray = new int[2*array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
            array = newArray;
            return array;
    }
    
    public WordNode[] doubleArraySize(WordNode[] array){
        WordNode[] newArray = new WordNode[2 * array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
            array = newArray;
            return array;
    }
}
