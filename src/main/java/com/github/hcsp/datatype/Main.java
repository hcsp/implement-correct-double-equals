package com.github.hcsp.datatype;

import sun.lwawt.macosx.CSystemTray;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 这里应该输出true，实际输出的却是false
        // 请查找、思考并修复doubleEquals方法中的问题
        System.out.println(doubleEquals(0.1 + 0.2, 0.3));
    }

    // 判断两个double是否相等
    public static boolean doubleEquals(double a, double b) {
        System.out.println(a);
        System.out.println(b);

        if(Math.abs(a-b)< 0.00000001) {
            return true;
        }else  {
            return false;
        }
    }
}
