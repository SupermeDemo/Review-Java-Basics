package cn.Method2;

/**
 * @Author: superman
 * @Date: 2020/2/19 13:54
 * @Version 1.0
 */
public class Method_Demo1 {
    public static void main(String[] args) {

        print();

        int sum = getSun(1,3);
        System.out.println(sum);
        System.out.println(getSun(2,3));
    }
    public static int getSun(int a,int b){
        return a+b;
    }


    public static void print(){
        System.out.println("方法调用");
    }
}
