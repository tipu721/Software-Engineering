package algo.sort;

public class MergeSort {


    private static void sort(int[] arr, int l, int r) {
        if(l < r){
            int mid =  (l + r)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l,  mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int[] L = new int[mid - l +1];
        int[] R = new int[r - mid ];
        for(int i = l, j=0; i <= mid; i++, j++){
            L[j] = arr[i];
        }
        for(int i=mid+1, j=0; i<= r; i++,j++){
            R[j] = arr[i];
        }
        int i = 0, j = 0, k = l;
        while (i <= mid && j < r-mid){
            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }
            else {
                arr[k++] = R[j++];
            }
        }
        for(int p = i; p <= mid - l; p++){
            arr[k++] = L[p++];
        }
        for(int p = j; p < r - mid; p++){
            arr[k++] = R[p++];
        }

    }


    public static void main(String[] args) {

        int arr[] = {2, 1, 10, 6, 2, 5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        sort(arr, 0, arr.length - 1);
        System.out.println("After Sort");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }


}
