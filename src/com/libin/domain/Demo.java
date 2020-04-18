package com.libin.domain;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int sum = 0;//方法一
        for (int i = 1; i <= 9; i++) {
            sum += i * 10 + i;
        }
        System.out.println(sum);

        int sum1 = 0;//方法二
        for (int i = 10; i < 100; i++) {
            if (i / 10 == i % 10) {
                sum1 += i;
            }
        }
        System.out.println(sum1);
        int sum2 = 0;//方法三
        for (int i = 10;i<=99;i++){
            if (i%11==0){
                sum2+=i;
            }
        }
        System.out.println(sum2);

    }
}




