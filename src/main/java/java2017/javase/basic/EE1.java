package java2017.javase.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 李朋 on
 * 2017/3/21 0021 下午 4:40.
 */
//生成一个随机数  系统提示大了小了  猜对为止
// 1. 生成一个随机整数（10000） 100 小了 1000 小了 100000 大了 10000 对了
public class EE1 {

    private static int x;
    private static int counter;
    private static String result;

    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        //System.out.println(x);
        //guess();

    }


    private static void guess() {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        //int y = ai( result);

        if (y > x) {
            System.out.println("大了");
            counter++;
            result = "大了";
            guess();
        } else if (y < x) {
            System.out.println("小了");
            result = "小了";
            counter++;
            guess();
        } else {
            System.out.println("猜对了！");
            counter++;
            System.out.println(counter);
        }

    }

    //private static int ai(String result) {
        // ...
       // return 0;
}


