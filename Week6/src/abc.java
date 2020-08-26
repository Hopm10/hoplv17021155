import java.util.ArrayList;
import java.util.List;

public class abc {
    public static <T> void printArr(T[] inputArray) {
        for ( T element : inputArray ){
            System.out.print(element + " ");
        }
    }
    public static <T extends Comparable<T>> List <T> sortGeneric(List<T> arr) {
        T max = arr.get(0);
        List <T> newArr = new ArrayList<>();
        for (int i = 0; i < arr.toArray().length; i++) {
            for (int j = 1; j < arr.toArray().length - 1; j++) {
                if(arr.get(i).compareTo(arr.get(j)) > 0){
                    arr.get(j) = max;
                }
            }
        }
        for (T s : arr){
            if (s.compareTo(max) > 0){
                return
            }
        }

        return newArr;
    }

    public static void main( String args[] ) {
        Integer[] intArr = { 10, 12, 3, -4, 5 };
        Double[] doubleArr = { 5.1, 2.5, 7.3, -4.5 };
        Character[] charArr = { 'U', 'E', 'T', 'V', 'N', 'U' };

        System.out.println("Mang intArr bao gom:");
        printArr(intArr);

        System.out.println("\nMang doubleArr bao gom:");
        printArr(doubleArr);

        System.out.println("\nMang charArr bao gom:");
        printArr(charArr);
    }
}
