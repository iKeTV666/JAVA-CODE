package com.it;

public class Q2 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 100; i <= 999; i++) {
            if(isShuiXian(i)){
                count1++;
            }
        }
        for (int i = 10; i <= 99; i++) {
            if (isShuiXian(i)){
                count2++;
            }
        }
        System.out.println("二位自幂数的个数为：" + count2);
        System.out.println("水仙花数的个数为：" + count1);
    }
    public static boolean isShuiXian(int num){
        /*int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        return ge * ge * ge + shi * shi * shi + bai * bai * bai == num;*/
        int len = getnumLength(num);
        int sum = 0;
        int temp = num;
        while (temp > 0){
            int ge = temp % 10;
            sum = (int) Math.pow(ge,len) + sum;
            temp /= 10;
        }
        if (sum == num){
            return true;
        }
        return false;
    }
    public static int getnumLength(int num){
        int count = 0;
        if (num == 0){
            return 1;
        }
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
