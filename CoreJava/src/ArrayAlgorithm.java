import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

/**
 * created by Acer on 5/26/23
 **/
public class ArrayAlgorithm {

    public static void main(String[] args) {
        //Linear Search
        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        //Linear Search 2
        linearSearch2(arr, 1).ifPresent(System.out::println);
        
        //Binary Search
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 9));
    }

    public static boolean linearSearch(int[] arr, int item){
        for(int current : arr){
            if(current == item){
                return true;
            }
        }
        return false;
    }

    public static OptionalInt linearSearch2(int[] arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static boolean binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length - 1;

        while (min <= max){
            int mid = (min + max)/2;
            if(item == arr[mid]){
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }


    //Using Loops
    public static int[] findEvenNums(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        for(int element : arr1){
            if(element % 2 == 0){
                result.add(element);
            }
        }

        for(int element : arr2){
            if(element % 2 == 0){
                result.add(element);
            }
        }

        //Convert Arraylist into array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //Using Java Streams
    public static  int[] findEvenNum2(int[] arr1, int[] arr2){
        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).filter(isEvenPred).toArray();
    }
}
