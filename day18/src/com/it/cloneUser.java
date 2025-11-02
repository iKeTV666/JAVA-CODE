package com.it;

import java.util.StringJoiner;

public class cloneUser implements Cloneable{

     private String name;
     private int ID;
     private int[] arr;

    public cloneUser() {
    }

    public cloneUser(String name, int ID, int[] arr) {
        this.name = name;
        this.ID = ID;
        this.arr = arr;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * 设置
     * @param arr
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public String toString() {
        return "cloneUser{name = " + name + ", ID = " + ID + ", arr = " + arrayToString(arr) + "}";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        int[] data = this.arr;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        cloneUser u = (cloneUser) super.clone();
        u.arr = newData;
        return super.clone();
    }
    public String arrayToString(int[] arr){
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
