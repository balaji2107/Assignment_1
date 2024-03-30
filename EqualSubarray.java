public class EqualSubarray {
    public static int[] findSub(int[] nums) {
        int max= 0,start = -1,end = -1,count = 0;
        int maxIndex = nums.length - 1;
        int[] arr2 = new int[2 * nums.length + 1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = -1;
        }
        arr2[nums.length] = 0;
        for (int i = 0; i <= maxIndex; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if (arr2[count + nums.length] != -1) {
                int len = i - arr2[count + nums.length] + 1;
                if (len > max) {
                    max = len;
                    start = arr2[count + nums.length];
                    end = i;
                }
            } else {
                arr2[count + nums.length] = i + 1;
            }
        }
        if (start != -1 && end != -1) {
            return subarray(nums, start, end);
        } else {
            return new int[0];
        }
    }
    public static int[] subarray(int[] arr, int start, int end) {
        int[] subarray = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
            subarray[j] = arr[i];
        }
        return subarray;
    }
    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
