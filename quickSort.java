import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);   // 왼쪽 정렬
            quickSort(arr, pivotIndex + 1, high);  // 오른쪽 정렬
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // 마지막 요소를 피벗으로 설정
        int i = low - 1;        // 작은 값의 인덱스 추적

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (피벗 위치 정렬)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // 피벗의 최종 위치 반환
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nx = Integer.parseInt(br.readLine());
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            x[i] = Integer.parseInt(br.readLine());
        }

        quickSort(x, 0, nx - 1);

        // 정렬된 결과 출력
        for (int i = 0; i < nx; i++) {
            System.out.println(x[i]);
        }
    }
}
