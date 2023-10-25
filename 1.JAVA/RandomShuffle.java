package CloudVandana;

import java.util.Arrays;
import java.util.Random;

public class RandomShuffle {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] shuffleArray(int[] arr) {
        //create a random class

        Random r =  new Random();

        for(int i=0;i<arr.length;i++){
            //get an index by nextInt method exclusive
            int ranIndex = r.nextInt(arr.length);
            //swap the index element with the ranIndex
            int temp = arr[i];
            arr[i] = arr[ranIndex];
            arr[ranIndex] = temp;
        }
        return arr;
    }
}
