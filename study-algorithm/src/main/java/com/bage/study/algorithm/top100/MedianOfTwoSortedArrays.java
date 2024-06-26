package com.bage.study.algorithm.top100;

/**
 * https://leetcode.cn/problems/median-of-two-sorted-arrays/
 *
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double medianSortedArrays = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2);
        System.out.println(medianSortedArrays);


        nums1 = new int[]{1,2};
        nums2 = new int[]{3,4};
        medianSortedArrays = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2);
        System.out.println(medianSortedArrays);


    }

    /**
     * 两个有序数组的 中位数 ，中间一个的值，，如果是偶数，则中间两个值的平均值
     * 处理过程【本质上就是合并有序数组 】
     * 1、比较当前两个数组的最考前位置两个元素，取较小元素
     * 2、下标后移
     * 3、重复以上两个过程
     * 4、 如果有一个结束，则继续处理另一个
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedianSortedArrays(nums2);
        }
        if (nums2.length == 0) {
            return findMedianSortedArrays(nums1);
        }
        int total = nums1.length + nums2.length;
        int numsAll[] = new int[total];

        int nums1Index = 0;
        int nums2Index = 0;
        for (int i = 0; i < total; i++) {
            if (nums1[nums1Index] <= nums2[nums2Index]) {
                numsAll[i] = nums1[nums1Index];
                nums1Index = nums1Index+1;
            } else {
                numsAll[i] = nums2[nums2Index];
                nums2Index = nums2Index+1;
            }
            if(nums1Index >= nums1.length && nums2Index < nums2.length) {
                append(nums2,nums2Index,i+1,numsAll);
                break;
            } else if(nums2Index >= nums2.length && nums1Index < nums1.length){
                append(nums1,nums1Index,i+1,numsAll);
                break;
            }
        }
        return findMedianSortedArrays(numsAll);
    }

    private void append(int[] source, int sourceCurrent, int index, int[] numsAll) {
        for (int i = 0; i < source.length - sourceCurrent; i++) {
            numsAll[index+i] = source[sourceCurrent+i];
        }
    }

    private double findMedianSortedArrays(int[] nums) {
        if (nums.length % 2 == 1) {
            return nums[(nums.length) / 2];
        }
        //  nums.length % 2 == 0
        return (nums[(nums.length - 1) / 2] + nums[nums.length / 2]) / 2.0;
    }
}
