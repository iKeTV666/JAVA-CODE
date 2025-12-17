package com.it;

public class fenkuaiSerch {
    public static void main(String[] args) {
        int[] arr = {27,22,30,40,36,13,19,16,20,7,10,43,50,48};
        block b1 = new block(22,40,0,4);
        block b2 = new block(13,20,5,8);
        block b3 = new block(7,10,9,10);
        block b4 = new block(43,50,11,13);
        block[] barr = {b1,b2,b3,b4};
        int a = findNumber(arr,barr,11);
        System.out.println(a);
    }

    public static int findNumber(int[] arr,block[] barr,int number){
        int a = findBlock(barr,11);
        if (a == -1){
            System.out.println("数字不存在");
        }
        for (int i = barr[a].getStart(); i < barr[a].getEnd(); i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static int findBlock(block[] barr,int number){
        for (int i = 0; i < barr.length; i++) {
            if (barr[i].getMin() <= number && number <= barr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
class block{
    int min;
    int max;
    int start;
    int end;

    public block() {
    }

    public block(int min, int max, int start, int end) {
        this.min = min;
        this.max = max;
        this.start = start;
        this.end = end;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * 设置
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 获取
     * @return end
     */
    public int getEnd() {
        return end;
    }

    /**
     * 设置
     * @param end
     */
    public void setEnd(int end) {
        this.end = end;
    }

    public String toString() {
        return "block{min = " + min + ", max = " + max + ", start = " + start + ", end = " + end + "}";
    }
}
