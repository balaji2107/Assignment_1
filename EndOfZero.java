public class EndOfZero {
    public static void main(String[] args) {
        int[] arr={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int i=0,j=0;
        while (i<arr.length && j<arr.length){
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (j != i) {
                    arr[i] = 0;
                }
                j++;
            }
            i++;
        }

    }
}
