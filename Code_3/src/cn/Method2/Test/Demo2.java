package cn.Method2.Test;

/**
 * @Author: superman
 * @Date: 2020/2/19 14:32
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {

        int [] arr = {2,3,4,35,45,4,6};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int [] arr){
        arr[0] = 200;
    }
}
