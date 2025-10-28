package com.it.hw2;

public class emplooye{
    private String name;
    private String workNumber;
    private double kyuryo;

    public emplooye() {
    }

    public emplooye(String name, String workNumber, double kyuryo) {
        this.name = name;
        this.workNumber = workNumber;
        this.kyuryo = kyuryo;
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
     * @return workNumber
     */
    public String getWorkNumber() {
        return workNumber;
    }

    /**
     * 设置
     * @param workNumber
     */
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    /**
     * 获取
     * @return kyuryo
     */
    public double getKyuryo() {
        return kyuryo;
    }

    /**
     * 设置
     * @param kyuryo
     */
    public void setKyuryo(double kyuryo) {
        this.kyuryo = kyuryo;
    }
    public void work() {
        System.out.println("正在工作");
    }
}
