import java.util.Arrays;

public class Pract_5_1 {
    public static void main(String[] args) {
        int[] array = {1,22,3,44,5,6,7,81,9,15,11,12,13,14};
        System.out.println("\nold array:\n");
        for (int j : array) {
            System.out.printf("%d\t", j);
        }
        System.out.println("\n");
        int[] new_array = bubbleSort(array);
        System.out.println("\nnew array:\n");
        for (int j : new_array) {
            System.out.printf("%d\t", j);
        }

        boolean res = isProgress(new_array);
        if(res){
            System.out.println("\nThe elements of the array make up an arithmetic progression\n");
            int difference = new_array[1]- new_array[0];
            System.out.printf("Difference: %d\n", difference);
        }
        else{
            System.out.println("\nThe elements of the array do NOT make up an arithmetic progression\n");
        }



    }
    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
    public static boolean isProgress(int[] new_array){
        boolean progress = false;
        int count = 0;
        for(int i = 0; i < new_array.length-2; i++) {
            if (new_array[i + 1] - new_array[i] == new_array[i + 2] - new_array[i + 1]) {
                count++;
                if(count == new_array.length-2){
                    progress = true;
                }
            }
        }
        return progress;
    }
}
