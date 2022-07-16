package com.lqq;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LambdaDemo01 {
    //传统写法
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("我是匿名内部类");
//            }
//        }).start();
//    }
    public static void main(String[] args) {
//        new Thread(() -> {
//            System.out.println("我是匿名内部类");
//
//        }).start();
//        int i = calculateNum(new IntBinaryOperator() {
//            @Override
//            public int applyAsInt(int left, int right) {
//                return left + right;
//            }
//        });
//        System.out.println(i);

        /**printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value%2==0;
            }
        });**/
      /**  printNum((int value)->{
            return value%2==0;
        });
        **/
//        Integer result = typeConver(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.valueOf(s);
//            }
//        });
//        Integer result =typeConver((String s)->{
//                return Integer.valueOf(s);
//          });

//        String result = typeConver(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s+"你好";
//            }
//        });
//        String result = typeConver((String s)->{
//                return s+"你好";
//            });
//        System.out.println(result);
//遍历
//        foreachArr(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println(value);
//            }
//        });

        foreachArr((int value)->{
              System.out.println(value);
            });
        System.out.println("我是test2");
        System.out.println("我是hot-fix");
        System.out.println("我是master");
        System.out.println("我是hot-fix2");
        System.out.println("我是pull");
    }

    public static void foreachArr(IntConsumer consumer){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i:arr){
            consumer.accept(i);
        }
    }

    public static <R> R typeConver(Function<String,R> function){
        String str="1234";
        R result=function.apply(str);
        return result;
    }
    public static void printNum(IntPredicate predicate){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i:arr){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
