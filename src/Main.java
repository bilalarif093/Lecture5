import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //declare
        int [] arr = new int[10];//dynamic array
        int [] arr1 = {70,100,10,5};//static array
        //
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        //foreach loop
        int index = 0;
        for (int data : arr1){
            System.out.println(data);
            index++;
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.binarySearch(arr1,100));
        for (int data :arr1){
            System.out.println(data);
        }

    }
}