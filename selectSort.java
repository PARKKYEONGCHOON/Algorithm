import java.util.Scanner;

public class selectSort {
    
    static void swap(int[] array, int idx1, int idx2){
        int n = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = n;
    }

   
    static void selSort(int[] array, int size){

        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;
    
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
    
            swap(array, i, minIdx);
        }

    }

    public static void main(String[] args) {
        
         Scanner stdIn = new Scanner(System.in);

        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            x[i] = stdIn.nextInt();
        }

        selSort(x, nx);


    }

}
