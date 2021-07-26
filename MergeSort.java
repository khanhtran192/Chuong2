import java.util.Random;
public class MergeSort {
    void sort(int A[], int l, int r) {
        if (l < r) {

            // Tim diem chinh giua
            int m = (l + r) / 2;

            // Ham de quy tiep tuc chia doi
            sort(A, l, m);
            sort(A, m + 1, r);

            merge(A, l, m, r);
        }
    }
    

    // Merge hai mang con cua A[].
    // mang con thu nhat la A[l..m]
    // mang con thu hai la A[m+1..r]
    void merge(int A[], int l, int m, int r) {

        // Tim kich thuoc cua 2 mang con de merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tao mang tam
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy du lieu vao mang tam
        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[m + 1 + j];

        // Merge cac mang tam lai

        // Chi muc ban dau cua 2 mang con
        int i = 0, j = 0;

        // Chi muc ban dau cua mang phu duoc hop nhat
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chep cac phan tu con lai cua L[] neu co
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        // Sao chep cac phan tu con lai cua R[] neu co
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }

    }

    // In cac phan tu cua mang
    static void printAay(int A[]) {
        int n = A.length;
        for (int i = 0; i < n; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Random rd = new Random();
        int[] A = new int[10]; 
        for(int i=0; i<A.length; i++){
            A[i] = rd.nextInt(); 
        }

        System.out.println("Mang ban dau:");
        printAay(A);

        MergeSort ob = new MergeSort();
        ob.sort(A, 0, A.length - 1);
        
        System.out.println("Mang sau khi sap xep:");
        printAay(A);
    }
}