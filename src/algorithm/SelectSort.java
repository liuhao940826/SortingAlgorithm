package algorithm;

import com.alibaba.fastjson.JSON;

/**
    * @Author: liuhao
 * @Description:
 * @Date: Create in 3:58 PM 2019/3/11
 */
public class SelectSort {


    public static void main(String[] args) {
        int [] nums = {3,1,4,2,5,8,6,7};
        selfSelectSort(nums);
        System.out.println(JSON.toJSONString(nums));
    }

    /**
     * 选择排序
     * @Description:  它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，
     *                再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     * @param nums
     * @return
     */
    public static void selectSort(int[] nums) {

        int length = nums.length;

        int minIndex;int temp;

        for (int i = 0; i < length; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {

                if (nums[j] < nums[minIndex]) {// 寻找最小的数
                    minIndex = j;           // 将最小数的索引保存 获取这次比较中最小的索引 4 2 1 3  1的index才是最小的
                }
            }
            //交换位置
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

    }

    /**
     * 选择排序
     * @return
     */
    public static void selfSelectSort(int [] nums){

        int length = nums.length;

        int minIndex,temp;

        for (int i = 0; i < length; i++) {
            //默认每次比较的第一个是最小单位
            minIndex=i;
            for (int j =i+1; j < length; j++) {
                //每次跟最小的比 交换索引
                if(nums[j]<nums[minIndex]){
                    //交换最小单位的下标
                    minIndex=j;
                }
            }
            temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }

    }

}