import java.util.*;

public class bubbleSort {

    static void swap(int[] a, int idx1, int idx2)
    {
        int n = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = n;
    }

    static void bubble(int[] a, int n)
    {
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = n - 1; j > i; j--)
            {
                if(a[j - 1] > a[j])
                {
                    swap(a, j - 1, j);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            x[i] = stdIn.nextInt();
        }

        bubble(x, nx);
    }
}