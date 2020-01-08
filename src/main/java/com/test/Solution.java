package com.test;

/**
 * Created by Administrator on 2019/3/8.
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0; // nums1的指针
        int index2 = 0; // nums2的指针
        double[] num = new double[length1 + length2];
        for (int i = 0; i < length1 + length2; i++) {
            if (index1 >= length1) {
                num[i] = nums2[index2];
                index2++;
            } else if (index2 >= length2 ) {
                num[i] = nums1[index1];
                index1++;
            } else {
                if (nums1[index1] <= nums2[index2]) {
                    num[i] = nums1[index1];
                    index1++;
                } else {
                    num[i] = nums2[index2];
                    index2++;
                }
            }
        }
        if (num.length % 2 == 0) {
            return (num[num.length / 2 - 1] + num[num.length / 2]) / 2;
        } else {
            return num[num.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

}
