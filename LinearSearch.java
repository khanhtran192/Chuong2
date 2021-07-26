import java.util.Random;
public class LinearSearch {
    Random rd = new Random();
    public void RandomInput() {
        int[] A = new int[100]; 
            for(int i=0; i<A.length; i++){
                A[i] = rd.nextInt(); 
            }
        int n;
        n = rd.nextInt();
        System.out.println("Day so: ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("So can tim: " + n);
        search(A, n);
    }
    public void search(int[] A, int n){
        for(int i=0; i<A.length; i++){
            if(A[i]==n){
                System.out.println("n o vi tri thu" + i+1 + " cua day");
                break;
            }
            else{
                System.out.println("n deo co trong day");
                break;
            }
        }

    }
    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        search.RandomInput();
    }
}