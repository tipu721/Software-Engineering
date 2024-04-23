package algo.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ar = {1, 5, 1, 5, 4, 2, 3};
        for(int i=0; i<ar.length; i++){
            int minPos = i;
            for(int j = i+1; j<ar.length; j++){
                if(ar[j] < ar[minPos]){
                    minPos = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[minPos];
            ar[minPos] = temp;
        }

        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
