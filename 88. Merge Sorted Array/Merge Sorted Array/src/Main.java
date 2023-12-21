public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int num: nums1) {
            System.out.println(num);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num2: nums2) {
            chenPhanTuVaoMang(num2, nums1, m);
            m++;
        }
    }

    public static void chenPhanTuVaoMang(int num2, int[] nums1, int m) {
        boolean founded = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > num2) {
                founded = true;
                for (int j = m - 1; j >= i ; j--) {
                    nums1[j + 1] = nums1[i];
                }
                nums1[i] = num2;
                break;
            }
        }
        if (!founded) {
            nums1[m] = num2;
        }
    }
}