package algo.sort;

public class BubbleSort {


    private static void bubbleSort(int[] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j< ar.length - i - 1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] ar = {1, 3, 1, 5, 4, 2, 3};
        bubbleSort(ar);
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
