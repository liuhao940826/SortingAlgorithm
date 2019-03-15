package algorithm;

import com.alibaba.fastjson.JSON;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 5:36 PM 2019/3/11
 */
public class InsertionSort {


    public static void main(String[] args) {

        int[] nums ={14,2,3,4,6,7,13,5,7,8,10,9,1};

        selfInsertionSort(nums);

        System.out.println(JSON.toJSONString(nums));

    }

    /**
     * 插入排序 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
     * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
     *
     * 从第一个元素开始，该元素可以认为已经被排序；
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     * 将新元素插入到该位置后；
     * 重复步骤2~5。
     * @param nums
     * @return
     */
    public static void insertionSort(int[] nums){

        int length= nums.length;

        int preIndex,currentNums;
        for (int i = 1; i < length; i++) {
            //从第二个数开始 前一个数的下标
            preIndex=i-1;
            //记录当前书
            currentNums=nums[i];

            while(preIndex>=0 && currentNums< nums[preIndex]){
                //把已排序的数字 和新的数字当前位置交换位置
                nums[preIndex+1]= nums[preIndex];

                preIndex--;
            }
            //把新数字放入应该放的位置
            nums[preIndex+1] =currentNums;
        }

    }


    /**
     * 插入排序
     * @param nums
     */
    public static  void  selfInsertionSort(int [] nums){

        int  length = nums.length;

        int preIndex,current;

        for (int i = 1; i < length; i++) {

            preIndex=i-1;

            current=nums[i];

            while(preIndex>=0 && current<nums[preIndex]){
                nums[preIndex+1] =nums[preIndex];

                preIndex--;
            }
            //把新数字放在 之前按个数字的后面
            nums[preIndex+1]= current;
        }

    }




}
