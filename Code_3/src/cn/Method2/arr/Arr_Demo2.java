package cn.Method2.arr;

/**
 * @Author: superman
 * @Date: 2020/2/19 14:16
 * @Version 1.0
 */
public class Arr_Demo2 {
    public static void main(String[] args) {
        int arr[] = {1,2,32,43,4,35,4};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
