package cn.Method2.arr;

/**
 * @Author: superman
 * @Date: 2020/2/19 14:26
 * @Version 1.0
 */
public class Arr_Return2 {
    public static void main(String[] args) {

        int[] arr = getArray();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] getArray(){
        int [] arr={1,2,3,24,3,43};
        return arr;
    }
}
