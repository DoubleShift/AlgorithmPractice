import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = 10;
        int[] array = {6,1,2,7,9,3,4,5,10,8};


        quicksort(array,0, n-1);
        System.out.println(Arrays.toString(array));
        in.close();
    }

    ;

    public static void quicksort(int[] array, int left, int right) {
        int i, j, temp, t;

        if (left > right) return;

        temp = array[left];
        i = left;
        j = right;

        while (i != j) {
            while (array[j] >= temp && i < j) j--;
            while (array[i] <= temp && i < j) i++;
            if (i < j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }

        }
        array[left] = array[i];
        array[i] = temp;

        quicksort(array,left, i - 1);
        quicksort(array,i + 1, right);
    }

}





