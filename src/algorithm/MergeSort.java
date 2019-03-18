package algorithm;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 5:34 PM 2019/3/13
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] array = {8, 9, 1, 7, 2, 3, 5, 4, 2, 0};

        array = selfMergeSort(array);

        System.out.println(JSON.toJSONString(array));

    }

    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


    public static int[] selfMergeSort(int[] nums) {
        //递归调用的时候处理
        if (nums.length < 2) {
            return nums;
        }
        int mid = nums.length / 2;
        //拆分数组
        int left[] = Arrays.copyOfRange(nums, 0, mid);
        int right[] = Arrays.copyOfRange(nums, mid, nums.length);
        //
        return selfMerge(selfMergeSort(left), selfMergeSort(right));
    }

    /**
     * merge
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] selfMerge(int[] left, int[] right) {
        //创建新的集合
        int[] result = new int[left.length + right.length];
        //i 控制左边  j控制右边 index代表最终结果集的坐标
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {

            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

}
