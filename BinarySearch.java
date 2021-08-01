import java.util.Random;

public class BinarySearch {
    Random rd = new Random();

    public void RandomInput() {
        int[] A = new int[10];
        A[0] = rd.nextInt();
        for (int j = 1; j < A.length; j++) {
            do{
                A[j]= rd.nextInt();
            }while(A[j] <= A[j-1]);
        }
            // }while(0<A[i] && A[i] <20);
        
        int n, key;
        key = rd.nextInt();
        n = rd.nextInt();
        System.out.println("Day so: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("So can tim: " + n);
        Search(A, key);

    }

    public static void Search(int[]A, int key) {
        int first = 0;
        int last = A.length-1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (A[mid] < key) {
                first = mid + 1;
            } else if (A[mid] == key) {
                System.out.println("So can tim o vi tri: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Khong ton tai so trong day!");
        }

    }

    public static void main(String[] args){
        BinarySearch br = new BinarySearch();
        br.RandomInput();
    }
}