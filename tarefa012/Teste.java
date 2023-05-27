import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] arr100R = new int[100];
        for (int i = 0; i < arr100R.length; i++) { arr100R[i] = rd.nextInt();}

        int[] arr1000R = new int[1000];
        for (int i = 0; i < arr1000R.length; i++) { arr1000R[i] = rd.nextInt();}

        int[] arr10000R = new int[10000];
        for (int i = 0; i < arr10000R.length; i++) { arr10000R[i] = rd.nextInt();}

        System.out.println("Recursiva: \n");

        long start = System.currentTimeMillis();
        mergeSortRecursivo(arr100R, 100);
        long end = System.currentTimeMillis();
        System.out.println("100 Elementos: " + (end - start) + "\n");

        start = System.currentTimeMillis();
        mergeSortRecursivo(arr1000R, 1000);
        end = System.currentTimeMillis();
        System.out.println("1000 Elementos: " + (end - start) + "\n");

        start = System.currentTimeMillis();
        mergeSortRecursivo(arr10000R, 10000);
        end = System.currentTimeMillis();
        System.out.println("10000 Elementos: " + (end - start) + "\n");

        System.out.println("------------------------------------------- \n\n");
        
        int[] arr100I = new int[100];
        for (int i = 0; i < arr100I.length; i++) { arr100I[i] = rd.nextInt();}

        int[] arr1000I = new int[1000];
        for (int i = 0; i < arr1000I.length; i++) { arr1000I[i] = rd.nextInt();}

        int[] arr10000I = new int[10000];
        for (int i = 0; i < arr10000I.length; i++) { arr10000I[i] = rd.nextInt();}

        System.out.println("Iterativa: \n");

        start = System.currentTimeMillis();
        mergeSortIterativo(arr100I, 100);
        end = System.currentTimeMillis();
        System.out.println("100 Elementos: " + (end - start) + "\n");
        

        start = System.currentTimeMillis();
        mergeSortIterativo(arr1000I, 1000);
        end = System.currentTimeMillis();
        System.out.println("1000 Elementos: " + (end - start) + "\n");

        start = System.currentTimeMillis();
        mergeSortIterativo(arr10000I, 10000);
        end = System.currentTimeMillis();
        System.out.println("10000 Elementos: " + (end - start) + "\n");
    }

    private static void mergeSortRecursivo(int[] a, int n){
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSortRecursivo(l, mid);
        mergeSortRecursivo(r, n - mid);
    
        mergeRecursivo(a, l, r, mid, n - mid);
    }

    private static void mergeRecursivo(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }

        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private static void mergeSortIterativo(int arr[], int n){
        int curr_size;
        int left_start;

        for (curr_size = 1; curr_size <= n-1; curr_size = 2*curr_size){
            for (left_start = 0; left_start < n-1; left_start += 2*curr_size){
                int mid = Math.min(left_start + curr_size - 1, n-1);
                int right_end = Math.min(left_start + 2*curr_size - 1, n-1);
                mergeIterativo(arr, left_start, mid, right_end);
            }
        }
    }

    private static void mergeIterativo(int arr[], int l, int m, int r){
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++) L[i] = arr[l + i];
        for (j = 0; j < n2; j++) R[j] = arr[m + 1+ j];

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }

            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
