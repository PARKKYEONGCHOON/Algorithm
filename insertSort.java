import java.util.Scanner;

public class insertSort {
    

    static void Sort(int[] a){
        
        
        for(int i = 1; i < a.length; i++){
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);

        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            x[i] = stdIn.nextInt();
        }

        Sort(x);

        
    }


}
