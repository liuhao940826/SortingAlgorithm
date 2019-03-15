package algorithm;

import com.alibaba.fastjson.JSON;

/**
 * @Author: liuhao
 * @Description: 希尔排序
 * @Date: Create in 6:04 PM 2019/3/12
 */
public class ShellSort {


    public static void main(String[] args) {

        int[] array = {8, 9, 1, 7, 2, 3, 5, 4, 2, 0};

        selfShellSort(array);

        System.out.println(JSON.toJSONString(array));

    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int [] ShellSort(int[] array) {
        int len = array.length;
        int temp;
        int gap = len / 2; //gap 代表相比的两个数之间的跨度

        while (gap > 0) {

            for (int i = gap; i < len; i++) {

                temp = array[i];

                int preIndex = i - gap;

                while (preIndex >= 0 && array[preIndex] > temp) {

                    array[preIndex + gap] = array[preIndex];

                    preIndex -= gap;
                }

                array[preIndex + gap] = temp;
            }

            gap /= 2;
        }
        return array;
    }


    /**
     * 自己理解的shell 排序的思想 先把无序的队列拆开,然后取中间数作为比较的间隔(gap)
     */
    public static void selfShellSort(int []nums){

        int length = nums.length;

        int temp ,gap =length/2;

        //当步长大于0的时候
        while(gap>0){
            //从间隔的位置开始比较
            for (int i = gap; i < length; i++) {
                //记录当时临时的数字
                temp=nums[i];
                //要比较的数的下标
                int preIndex=i-gap;

                //gap 间隔比较
                while(preIndex>=0 && nums[preIndex]>temp){
                    //交换当前位置
                    nums[preIndex+gap]=nums[preIndex];
                    //比较下标在按间隔往前挪动  3 4 2  ->3 2 4这个时候2和3还要比
                    preIndex-=gap;
                }
                //全部比完 然后把当前数放到最前面的那个位置 因为先去preindex-=gap所以加gap
                nums[preIndex+gap]= temp;
            }
            gap/=2;
        }
    }



}
