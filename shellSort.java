import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shellSort {
    
    static void Sort(int[] arr) {
        int n = arr.length;
    
        // 간격을 절반씩 줄여나감
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nx = Integer.parseInt(br.readLine());
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            x[i] = Integer.parseInt(br.readLine());
        }
        
        Sort(x);
    }
}
