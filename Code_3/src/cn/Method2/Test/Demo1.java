package cn.Method2.Test;

/**
 * @Author: superman
 * @Date: 2020/2/19 14:30
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void change(int a,int b){
        a = a+b;
        b = b+a;
    }
}
