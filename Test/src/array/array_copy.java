package array;

public class array_copy {
    public static void main(String[] args)
    {
        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        
        for (int j = 0; j < arr1.length; j++) {
            System.out.printf("arr1 : %d , arr2 : %d", arr1[j], arr2[j]);
        }

        System.arraycopy(arr2, 0, arr1, 0, 5);

        for (int j = 0; j < arr1.length; j++) {
            System.out.printf("arr1 : %d , arr2 : %d", arr1[j], arr2[j]);
        }
        
    }
}
